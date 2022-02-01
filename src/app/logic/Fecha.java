package app.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Fecha {

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
     * Constructor por defecto inicializa la fecha actual
     */
    public Fecha() {
        inicializarHoy();
    }

    /**
     * Constructor que recibe dia mes y anio
     *
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /*-------------------------------------------------------------
    /Métodos get y set de la clase Fecha
    /-------------------------------------------------------------*/
    /**
     * Regresa el dia
     *
     * @return int dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Asigna el dia
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Regresa el mes
     *
     * @return int mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Asigna el mes
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Método que regresa el mes en formato String
     *
     * @return String mes
     */

    public String getMesString() {
        // array de meses
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes + 1];
    }

    /**
     * Asigna el mes recibiendolo en formato String y convirtiendolo a entero
     *
     * @param mes
     * @return int mes
     */
    public int setMesString(String mes) {
        // array de meses
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                return i + 1;
            }
        }
        return 0;
    }

    /**
     * Regresa el anio
     *
     * @return int anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Asigna el anio
     *
     * @param anio
     */
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
     * Método que regresa un entero con la diferencia de edad en años
     *
     * @param fecha fecha de nacimiento
     * @return int edad
     */
    public int diferenciaEntreFechas(Fecha fecha) {
        Fecha hoy = new Fecha();
        // Calcular edad
        int edad = hoy.getAnio() - fecha.getAnio();
        if (hoy.getMes() + 1 < fecha.getMes()) {
            edad--;
        }
        if (hoy.getMes() + 1 == fecha.getMes() && hoy.getDia() < fecha.getDia()) {
            edad--;
        }
        return edad;
    }

    // Metodo toString()
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
