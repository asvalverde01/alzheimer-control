package app.test;

import app.logic.Fecha;

public class FechaTest {

    public static void main(String[] args) {
        System.out.println("Diferencia de fechas");
        Fecha fecha = new Fecha();
        fecha.setDia(21);
        fecha.setMes(01);
        fecha.setAnio(1972);
        int edad = fecha.calcularEdad(fecha);
        System.out.println("Edad  " + edad);
    }
}
