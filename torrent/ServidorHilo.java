import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ServidorHilo extends Thread{
    private DataInputStream entrada;
    private DataOutputStream salida;
    private String datosCliente;

    // constructor que recibe 3 parametros
    public ServidorHilo(DataInputStream entrada,DataOutputStream salida, String datosCliente){
        this.entrada = entrada;
        this.salida = salida;
        this.datosCliente = datosCliente;
    }

    @Override
    public void run(){
        System.out.println("Pendiente de implementar...");
    }
}

