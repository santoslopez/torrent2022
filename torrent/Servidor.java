/**
    Servidor utiliza hilo
*/

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;


public class Servidor{

    private static final int numeroPuerto = 9081;

    public static void main(String[] args){

        try{
            ServerSocket server = new ServerSocket(numeroPuerto);

            Socket socket;

            // para escuchar muchos clientes
            while(true){
                // Espera a que un cliente se conecte
                socket = server.accept();
                
                //System.out.println("Cliente conectado");
                
                
                DataInputStream entrada = new DataInputStream(socket.getInputStream());
                DataOutputStream salida = new DataOutputStream(socket.getOutputStream());

                String respuestaSaludo = "From: servidor\n"+"Type: WELCOME";
                salida.writeUTF(respuestaSaludo);
                String respuestaCliente = entrada.readUTF();
                
                ServidorHilo servidorH = new ServidorHilo(entrada, salida,respuestaCliente);
                servidorH.start();
                System.out.println(respuestaCliente);

                //System.out.println("Conexio con " + nombre + " creado.");
                //System.out.println("Conexion creado con el cliente: ");
                //salida.writeUTF("Hola " + nombre + " bienvenido al servidor");
                //socket.close();

            }

        }catch(IOException e){
            //System.out.println("Error: " + e.getMessage());
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}