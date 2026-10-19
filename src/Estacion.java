public class Estacion {
    // Atributos privados
    private int id;
    private String ubicacion;
    private String variable;
    private double lectura;

    // Atributo  Estatico
    private static int totalEstaciones = 0;

    // constructor reuqerido
    public Estacion(String ubicacion , String variable ) {
        totalEstaciones++;
        this.id = totalEstaciones;
        this.ubicacion = ubicacion;
        this.variable = variable;
        this.lectura = 0;

    }
    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
        System.out.println("La estacion" + ubicacion + " actualiza su lectura de " + variable + " a. " + lectura );
    }
    // metodo estaticas para consultar el total
    public static int getTotalEstaciones() {
        return totalEstaciones;
    }
}
