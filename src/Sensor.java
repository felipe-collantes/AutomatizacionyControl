public class Sensor {
    private int id;
    private String tipo;
    private String unidad;
    private double lectura;
    private static int cantidadSensores = 0;

    //constructor requerido
    public Sensor(String tipo, String unidad){
        cantidadSensores++;
        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        this.lectura = 0;


    }
    //metodo estatico para consultar la cantidad total de sensores
    public static int getCantidadSensores(){
        return cantidadSensores;
    }

}
