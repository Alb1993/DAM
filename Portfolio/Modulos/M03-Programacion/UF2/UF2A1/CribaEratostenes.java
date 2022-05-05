package UF2AI;

// Programa Java para imprimir todos los primos menores o iguales a n
// usando Criba de Eratóstenes - Sieve of Eratosthenes
public class CribaEratostenes {
    
    public static void main(String[] args) {
        int n = 30;
        System.out.print("Los siguientes son los números primos ");
        System.out.println("menores o igual que " + n);
        cribadeEratostenes(n);
    }
    
    public static void cribadeEratostenes(int n){
        // Crea una matriz booleana "primo" e inicializa todas las entradas como true.
        // Un valor en primo será finalmente false si i no es un primo (si no es verdadero).
        boolean primo[] = new boolean[n];
        for(int i=0;i<n;i++){
            primo[i]=true;
        }    
        for(int j=0; j<n;j++){
            for(int p = 2; p*p <=n; p++)
            {    // Si el primo no cambia, entonces es primo
                if(primo[j]==true)
                {
                    // Actualiza todos los múltiplos de p
                    for(int i = p*2; i <= n; i += p){
                        primo[j] = false;
                    }

                }
            }
        }

        // Imprimie todos los números primos
        for(int i = 2; i <= n; i++)
        {
            if(primo[i] == true){
                System.out.print(i + " ");
        
            }
        }    
    }
}
