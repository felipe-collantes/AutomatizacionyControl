//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // --- PRUEBA PRACTICA AC3.1 SENSORES
        Sensor s1 = new Sensor("Temperatura" , "°C");
        Sensor s2 = new Sensor("Humedad" , "%");
        System.out.println("Cantidad de sensores: "  + Sensor.getCantidadSensores());


        // ---PRUEBA PRACTICA AC3.2 (MOTORES)
        Motor m1 = new Motor("Motor principal" , 15.5);
        Motor m2 = new Motor("Motor secundario" , 10.0);
        // Enciende m1 y suma 1 a motores encendidos
        m1.encender();
        m2.encender();
        System.out.println("Total de motores: " + Motor.getTotalMotores());
        System.out.println("Motores encendidos: " + Motor.getMotoresEncendidos());

        // --- PRUEBA PRACTICA AC3.3 ESTACION DE MONITORES
        Estacion e1 = new Estacion("Laboratorio 1" , "Temperatura");
        e1.actualizarLectura(24.5);
        System.out.println("Total de estaciones: " + Estacion.getTotalEstaciones());
    }

}

