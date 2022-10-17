package HeroesOfVannaria;


public class Valkiria extends Personatge {
    
    public Valkiria(String nom,int forca,int cons,int vel,int inte,int sort) {
        super(nom,forca,cons,vel,inte,sort);        
    }

    public Valkiria(String nom,int forca,int cons,int vel,int inte,int sort,Arma arma) {
        super(nom,forca,cons,vel,inte,sort,arma);
    }

}
