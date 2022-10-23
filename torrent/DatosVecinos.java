/***

El archivo de texto que se lee es el siguiente: configuracion.txt

Clase que permite leer la configuracion inicial del archivo 
donde se encuentran el costo con los 2 vecinos, la direccion ip de los vecinos,
el nombre de los 2 vecinos, y los puertos que se utilizan para el forwarding
y routing.

***/

public class DatosVecinos{

    private String nombreVecino;
    private int costoVecino;
    private String direccionIPVecino;
    private int puertoRoutingVecino;
    private int puertoForwardingVecino;

    public DatosVecinos(String nombreVecino, int costoVecino, String direccionIPVecino, int puertoRoutingVecino, int puertoForwardingVecino){
        this.nombreVecino=nombreVecino;
        this.costoVecino=costoVecino;
        this.direccionIPVecino=direccionIPVecino;
        this.puertoRoutingVecino=puertoRoutingVecino;
        this.puertoForwardingVecino=puertoForwardingVecino;
    }

    public String getNombreVecino(){
        return nombreVecino;
    }

    public int getCostoVecino(){
        return costoVecino;
    }

    public String getDireccionIPVecino(){
        return direccionIPVecino;
    }

    public int getPuertoRoutingVecino(){
        return puertoRoutingVecino;
    }

    public int getPuertoForwardingVecino(){
        return puertoForwardingVecino;
    }


}