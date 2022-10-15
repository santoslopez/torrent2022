import java.util.Scanner;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//logger
import java.util.logging.Level;
// logger
import java.util.logging.Logger;
public class Cliente{

    private  static String HOST = "127.0.0.1";
    private static final int PUERTO = 9080;

    public static void main(String[] args){
        
        try{
            Scanner escaner = new Scanner(System.in);
            escaner.useDelimiter("\n");

            Socket socket = new Socket(HOST,PUERTO);


            // para recibir datos
            DataInputStream entrada = new DataInputStream(socket.getInputStream());
            // para enviar datos
            DataOutputStream salida = new DataOutputStream(socket.getOutputStream());

            // comenzar a leer datos del servidor
            String mensaje=entrada.readUTF();
            System.out.println(mensaje);

            String nombre = escaner.next();
            salida.writeUTF(nombre);

            ClienteHilo clienteH = new ClienteHilo(entrada, salida);
            clienteH.start();
            // para que no haga cosas raras
            clienteH.join();

        }catch(Exception e){
            //System.out.println("Error: " + e.getMessage());
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, e);
        }


    }   
}