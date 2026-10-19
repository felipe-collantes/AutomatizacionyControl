public class Motor {
    private int id;
    private String nombre;
    private double potencia;
    private boolean encendido;
    private static int totalMotores = 0;
    private static int motoresEncendidos= 0;

    //constructor requerido
    public Motor(String nombre,double potencia){
        totalMotores++;
        this.id = totalMotores;
        this.nombre= nombre;
        this.potencia = potencia;
        this.encendido = false;
    }

    //metodo para encender y apagar
    public void encender(){
        if (!this.encendido){
            this.encendido = true;
            motoresEncendidos++;
            System.out.println("El motor " + nombre +  " se ha encendido");
        }
    }
    public void apagar() {
        if (this.encendido){
            this.encendido = false;
            motoresEncendidos--;
            System.out.println("El motor" + nombre + "se ha apagado");
        }
    }

    //motores  estaticos
    public static int getTotalMotores(){
        return totalMotores;
    }
    public static int getMotoresEncendidos(){
        return motoresEncendidos;
    }
}
