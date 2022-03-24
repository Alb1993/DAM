package bloc3;

import java.util.Scanner;

public class bloc3_24 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fecha, fechaR="";
        int dianum=0, mesnum=0, anynum=0;
        boolean fechaValida=false;
                
        System.out.println("Introduce un dia:");
        fecha=in.nextLine();
        
        for(int i=0; i<fecha.length(); i++){
            if(fecha.charAt(i) != '-'){
            fechaR= fechaR + "" + fecha.charAt(i);
            /*El programa empieza a recoger los numeros i una vez que llega al guion, hace un volcado de los
            numeros recogidos en las variables.*/
            }else{
                if (dianum==0){
                dianum=Integer.parseInt(fechaR);        
                }else if (mesnum==0){
                mesnum=Integer.parseInt(fechaR);    
                }
                fechaR="";            
            }
            
            
        }
        /* Al final pondremos el año, ya que es el residuo que queda del bucle */
        anynum = Integer.parseInt(fechaR);
        
        if((dianum<=31)&&(mesnum==1)||(mesnum==3)||(mesnum==5)||(mesnum==7)||(mesnum==8)||(mesnum==10)||(mesnum==12)){
        fechaValida=true;
        }else if((dianum<=30)&&(mesnum==4)||(mesnum==6)||(mesnum==9)||(mesnum==11)){
        fechaValida=true;    
        }
        else if((dianum<=28)&&(mesnum==2)){
        fechaValida=true;
        }else{
        fechaValida=false;
        }   
        
        if (fechaValida==true){
        System.out.println("La fecha " + fecha + " es valida.");        
        }else{
        System.out.println("La fecha " + fecha + " no es valida.");        
        }
    }
}
