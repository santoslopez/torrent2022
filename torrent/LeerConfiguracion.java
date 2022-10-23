import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LeerConfiguracion{

    // read file
    public static void main(String[] args) throws IOException {
        
        String fileName = "configuracion.txt";
        String line = null;
        try {
            // leer el archivo
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
          
            while((line = bufferedReader.readLine()) != null) {
                
                String[] obtenerDatos = line.split(":");
               
                DatosVecinos datosV = new DatosVecinos(obtenerDatos[0],Integer.parseInt(obtenerDatos[1]),obtenerDatos[2],Integer.parseInt(obtenerDatos[3]),Integer.parseInt(obtenerDatos[4]));
                System.out.println("Nombre del vecino: "+datosV.getNombreVecino());
                System.out.println("Costo del vecino: "+datosV.getCostoVecino());
                System.out.println("Direccion IP del vecino: "+datosV.getDireccionIPVecino());
                System.out.println("Puerto de routing del vecino: "+datosV.getPuertoRoutingVecino());
                System.out.println("Puerto de forwarding del vecino: "+datosV.getPuertoForwardingVecino());

            }   
            bufferedReader.close();         
        }catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
    }
}