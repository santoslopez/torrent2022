public class DistanceVector{

    // algorith distance vector
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matriz = {{0, 1, 3, 7, 999, 999, 999},
                          {1, 0, 1, 999, 5, 999, 999},
                          {3, 1, 0, 2, 999, 999, 999},
                          {7, 999, 2, 0, 1, 3, 999},
                          {999, 5, 999, 1, 0, 1, 5},
                          {999, 999, 999, 3, 1, 0, 2},
                          {999, 999, 999, 999, 5, 2, 0}};
        int[] distancia = new int[7];
        int[] ruta = new int[7];
        int[] visitado = new int[7];
        int[] aux = new int[7];
        int[] aux2 = new int[7];
        int[] aux3 = new int[7];
        int[] aux4 = new int[7];
        int[] aux5 = new int[7];
        int[] aux6 = new int[7];
        int[] aux7 = new int[7];
        int[] aux8 = new int[7];
        int[] aux9 = new int[7];
        int[] aux10 = new int[7];
        int[] aux11 = new int[7];
        int[] aux12 = new int[7];
        int[] aux13 = new int[7];
        int[] aux14 = new int[7];
        int[] aux15 = new int[7];
        int[] aux16 = new int[7];
        int[] aux17 = new int[7];
        int[] aux18 = new int[7];
        int[] aux19 = new int[7];
        int[] aux20 = new int[7];
        int[] aux21 = new int[7];
        int[] aux22 = new int[7];
        int[] aux23 = new int[7];
        int[] aux24 = new int[7];
        int[] aux25 = new int[7];
        int[] aux26 = new int[7];
        int[] aux27 = new int[7];
        int[] aux28 = new int[7];
        int[] aux29 = new int[7];
        int[] aux30 = new int[7];


        // inicializar  
        for (int i = 0; i < 7; i++) {
            distancia[i] = 999;
            ruta[i] = 0;
            visitado[i] = 0;
        }
        distancia[0] = 0;
        ruta[0] = 0;
        visitado[0] = 1;

        // algoritmo
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
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
        for (int i = 0; i < 7; i++) {
            System.out.println("Distancia de 0 a " + i + " es " + distancia[i]);
        }
        System.out.println("Ruta de 0 a 1 es " + ruta[1]);
        System.out.println("Ruta de 0 a 2 es " + ruta[2]);
        System.out.println("Ruta de 0 a 3 es " + ruta[3]);
        System.out.println("Ruta de 0 a 4 es " + ruta[4]);
        System.out.println("Ruta de 0 a 5 es " + ruta[5]);
        System.out.println("Ruta de 0 a 6 es " + ruta[6]);

        // update routing table
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j] != 999) {
                    aux2[j] = distancia[i] + matriz[i][j];
                    if (aux2[j] < distancia[j]) {
                        distancia[j] = aux2[j];
                        ruta[j] = i;
                    }
                }
            }
        }

        // imprimir
        for (int i = 0; i < 7; i++) {
            System.out.println("Distancia de 0 a " + i + " es " + distancia[i]);
        }
        System.out.println("Ruta de 0 a 1 es " + ruta[1]);
        System.out.println("Ruta de 0 a 2 es " + ruta[2]);
        System.out.println("Ruta de 0 a 3 es " + ruta[3]);
        System.out.println("Ruta de 0 a 4 es " + ruta[4]);
        System.out.println("Ruta de 0 a 5 es " + ruta[5]);
        System.out.println("Ruta de 0 a 6 es " + ruta[6]);
        
}
}