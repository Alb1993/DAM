package Bloc4;

import java.util.Scanner;

public class parcial2 {
  
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        double res=0;
        int dni=0;
        char letra=' ';
        int num1=0, dni1=0;
        letra =' ';
        
        System.out.println("Introduce num dni");
        dni=in.nextInt();
        if((dni>99999999)||(10000000>dni)){
        System.out.println("numero no valido.");
        }else{
            res=dni%23;
            if(res=='0'){
            letra='T';
            }
            else if(res==1){
            letra='R';
            }
            else if(res==2){
            letra='W';
            }
            else if(res==3){
            letra='A';
            }else if(res==4){
            letra='G';
            }else if(res==5){
            letra='M';
            }else if(res==6){
            letra='Y';
            }else if(res==7){
            letra='F';
            }else if(res==8){
            letra='P';
            }else if(res==9){
            letra='D';
            }else if(res==10){
            letra='X';
            }else if(res==11){
            letra='B';
            }else if(res==12){
            letra='N';
            }else if(res==13){
            letra='J';
            }else if(res==14){
            letra='Z';
            }else if(res==15){
            letra='S';
            }else if(res==16){
            letra='Q';
            }else if(res==17){
            letra='V';
            }else if(res==18){
            letra='H';
            }else if(res==19){
            letra='L';
            }else if(res==20){
            letra='C';
            }else if(res==21){
            letra='K';
            }else if(res==22){
            letra='E';
            }else{
            System.out.println("numero no valido.");
            }
        }    
            System.out.println("la letra es " + letra);
        
    }
}