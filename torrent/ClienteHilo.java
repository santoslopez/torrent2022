import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ClienteHilo extends Thread{
    
        private DataInputStream entrada;
        private DataOutputStream salida;
    
        public ClienteHilo(DataInputStream entrada, DataOutputStream salida){
            this.entrada = entrada;
            this.salida = salida;
        }
    
        @Override
        public void run(){
            System.out.println("Pendiente de implementar...");
        }
        
}