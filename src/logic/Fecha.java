package app.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    /*-------------------------------------------------------------
    /Atributos de la clase Fecha
    /-------------------------------------------------------------*/
    private int dia;
    private int mes;
    private int anio;


    /*-------------------------------------------------------------
    /Constructores
    /-------------------------------------------------------------*/

    /**
     * Constructor con parámetros
     *
     * @param sFecha recibe una fecha en formato String con el formato dd/mm/yyyy
     */
    public Fecha(String sFecha) {
        String sDia = sFecha.substring(0, 2);
        String sMes = sFecha.substring(3, 5);
        String sAnio = sFecha.substring(6);

        dia = Integer.parseInt(sDia);
        mes = Integer.parseInt(sMes);
        anio = Integer.parseInt(sAnio);
    }

    /**
     * Constructor por defecto inicializa la fecha actual
     */
    public Fecha() {
        inicializarHoy();
    }


    /*-------------------------------------------------------------
    /Métodos get y set de la clase Fecha :s
    /-------------------------------------------------------------*/

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    /*-------------------------------------------------------------
    /Métodos complementarios de la clase Fecha
    /-------------------------------------------------------------*/

    /**
     * Método que inicializa la fecha actual utilizando el calendario Gregoriano
     */
    public void inicializarHoy() {
        GregorianCalendar gc = new GregorianCalendar();

        // Se obtienen los valores del dia, anio, mes
        dia = gc.get(Calendar.DAY_OF_MONTH);
        mes = gc.get(Calendar.MONTH);
        anio = gc.get(Calendar.YEAR);
    }

    /**
     * Método recibe dos fechas y modifica la fecha actual para que sea la diferencia
     *
     * @param fecha1 recibe un objeto de la clase Fecha
     * @param fecha2 recibe un objeto de la clase Fecha
     */
    public void diferenciaFechas(Fecha fecha1, Fecha fecha2) {
        dia = fecha1.getDia() - fecha2.getDia();
        mes = fecha1.getMes() - fecha2.getMes();
        anio = fecha1.getAnio() - fecha2.getAnio();
        dia = Math.abs(dia);
        mes = Math.abs(mes);
        anio = Math.abs(anio);
    }

}
