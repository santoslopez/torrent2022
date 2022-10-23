import java.util.Scanner;
 
public class BellmanFord
{
    private int distances[];
    private int numberofvertices;
    public static final int MAX_VALUE = 999;
 
    public BellmanFord(int numberofvertices)
    {
        this.numberofvertices = numberofvertices;
        distances = new int[numberofvertices + 1];
    }
 
    public void BellmanFordEvaluation(int source, int adjacencymatrix[][])
    {
        for (int node = 1; node <= numberofvertices; node++)
        {
            distances[node] = MAX_VALUE;
        }
 
        distances[source] = 0;
        for (int node = 1; node <= numberofvertices - 1; node++)
        {
            for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
            {
                for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
                {
                    if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
                    {
                        if (distances[destinationnode] > distances[sourcenode] 
                                + adjacencymatrix[sourcenode][destinationnode])
                            distances[destinationnode] = distances[sourcenode]
                                + adjacencymatrix[sourcenode][destinationnode];
                    }
                }
            }
        }
 
        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
        {
            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
            {
                if (adjacencymatrix[sourcenode][destinationnode] != MAX_VALUE)
                {
                    if (distances[destinationnode] > distances[sourcenode]
                           + adjacencymatrix[sourcenode][destinationnode])
                        System.out.println("The Graph contains negative egde cycle");
                }
            }
        }
 
        for (int vertex = 1; vertex <= numberofvertices; vertex++)
        {
            System.out.println("distance of source  " + source + " to "
                      + vertex + " is " + distances[vertex]);
        }
    }
 
    public static void main(String args[])
    {
        // representa el numero de equipos o routers incluyendo el router de uno
        int numberofvertices = 0;
        int source;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of vertices");
        numberofvertices = scanner.nextInt();

        /*
        La forma de ingresar los datos es por medio de una matriz. 
        Por ejemplo si tenemos 3 routers: A, B y C
        A->A = 0 (Costo)
        A->B = 3 (Costo)
        A->C = 5 (Costo)

        B->A = 3 (Costo)
        B->B = 0 (Costo)
        B->C = 1 (Costo)


        C->A = 5 (Costo)
        C->B = 1 (Costo)
        C->C = 0 (Costo)

        La forma de ingresar estos datos en la matriz es:
        0 3 5 (Estos 3 numeros corresponden a los costos de A->A, A->B y A->C respectivamente)
        3 0 1 (Estos 3 numeros corresponden a los costos de B->A, B->B y B->C respectivamente)
        5 1 0 (Estos 3 numeros corresponden a los costos de C->A, C->B y C->C respectivamente)
        
        */
        
        int adjacencymatrix[][] = new int[numberofvertices + 1][numberofvertices + 1];
        System.out.println("Enter the adjacency matrix");
        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++)
        {
            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++)
            {
                adjacencymatrix[sourcenode][destinationnode] = scanner.nextInt();
 	        if (sourcenode == destinationnode)
                {
                    adjacencymatrix[sourcenode][destinationnode] = 0;
                    continue;
                }
                if (adjacencymatrix[sourcenode][destinationnode] == 0)
                {
                    adjacencymatrix[sourcenode][destinationnode] = MAX_VALUE;
                }
            }
        }
 
        System.out.println("Enter the source vertex");
        source = scanner.nextInt();
 
        BellmanFord bellmanford = new BellmanFord(numberofvertices);
        bellmanford.BellmanFordEvaluation(source, adjacencymatrix);
        scanner.close();	
    }
}