package HeroesOfVannaria;

public class Dau {
 
    private int cares;
    
    public Dau(int cares) {
        this.cares = cares;
    }
    
    public int tirada() {
        return (int)(Math.random()*cares) + 1;
    }
}
