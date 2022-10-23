public class DistanceVector{

    // algorith distance vector
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int numeroRouters=6;

        // inicializando tabla de distancias 
        int[][] matriz = {{0,2,5,1,99,99},
                          {2,0,3,2,99,99},
                          {5,3,0,3,1,5},
                          {1,2,3,0,1,99},
                          {99,99,1,1,0,2},
                          {99,99,5,99,2,0}
                         };
        int[] distancia = new int[numeroRouters];
        int[] ruta = new int[numeroRouters];
        int[] visitado = new int[numeroRouters];
        int[] aux = new int[numeroRouters];
        int[] aux2 = new int[numeroRouters];

        // inicializar  
        for (int i = 0; i < numeroRouters; i++) {
            distancia[i] = 999;
            ruta[i] = 0;
            visitado[i] = 0;
        }
        distancia[0] = 0;
        ruta[0] = 0;
        visitado[0] = 1;

        // algoritmo
        for (int i = 0; i < numeroRouters; i++) {
            for (int j = 0; j < numeroRouters; j++) {
                if (matriz[i][j] != 999) {
                    aux[j] = distancia[i] + matriz[i][j];
                    if (aux[j] < distancia[j]) {
                        distancia[j] = aux[j];
                        ruta[j] = i;
                    }
                }
            }
        }

        // imprimir
        for (int i = 0; i < numeroRouters; i++) {
            System.out.println("Distancia de 0 a " + i + " es " + distancia[i]);
        }

        // BellmanFordEvaluation
        for (int i = 0; i < numeroRouters; i++) {
            for (int j = 0; j < numeroRouters; j++) {
                if (matriz[i][j] != 999) {
                    aux2[j] = distancia[i] + matriz[i][j];
                    if (aux2[j] < distancia[j]) {
                        System.out.println("El grafo contiene ciclo negativo");
                    }
                }
            }
        }
       
    }
}