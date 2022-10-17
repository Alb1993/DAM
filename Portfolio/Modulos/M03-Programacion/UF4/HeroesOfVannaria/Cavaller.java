package HeroesOfVannaria;

public class Cavaller extends Personatge {     
   
    public Cavaller(String nom,int forca,int cons,int vel,int inte,int sort) {
        super(nom,forca,cons,vel,inte,sort);        
    }
    
    public Cavaller(String nom,int forca,int cons,int vel,int inte,int sort,Arma arma) {
        super(nom,forca,cons,vel,inte,sort,arma);
    }
    
    
}
