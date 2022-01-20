package app.test;

import app.logic.Fecha;

public class FechaTest {

    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        System.out.println(fecha.getDia());
        System.out.println(fecha.getMes());
        System.out.println(fecha.getAnio());

        Fecha fecha2 = new Fecha();
        fecha2.setDia(1);
        fecha2.setMes(1);
        fecha2.setAnio(2021);
        System.out.println(fecha2.getDia());
        System.out.println(fecha2.getMes());
        System.out.println(fecha2.getAnio());

        System.out.println("Diferencia de fechas");
        Fecha fecha3 = new Fecha();
        fecha3.diferenciaFechas(fecha, fecha2);
        System.out.println(fecha3.getDia() + " dias");
        System.out.println(fecha3.getMes() + " meses");
        System.out.println(fecha3.getAnio() + " anios");
    }
}
