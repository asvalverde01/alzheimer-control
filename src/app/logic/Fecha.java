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
     * @param sFecha recibe una fecha en formato String con el formato
     *               dd/mm/yyyy
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

    /**
     * Constructor que recibe dia mes y anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /*-------------------------------------------------------------
    /Métodos get y set de la clase Fecha
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

    // retorna un string del mes
    public String getMesString() {
        // array de meses
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes];
    }

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
     * Método recibe dos fechas y modifica la fecha actual para que sea la
     * diferencia
     *
     * @param fecha recibe un objeto de la clase Fecha
     */
    public Fecha diferenciaFechas(Fecha fecha) {
        Fecha hoy = new Fecha();
        // Se calcula la diferencia entre dos fechas
        // Dias de diferencia
        int difDias = hoy.getDia() - fecha.getDia();
        // Meses de diferencia
        int difMeses = hoy.getMes() - fecha.getMes();
        // Anios de diferencia
        int difAnios = hoy.getAnio() - fecha.getAnio();
        return new Fecha(difDias, difMeses, difAnios);
    }

    public int calcularEdad(Fecha fecha) {
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

    // retorna un string del tiempo actual hora y minuto
    public String getHoraMinuto() {
        GregorianCalendar gc = new GregorianCalendar();
        int hora = gc.get(Calendar.HOUR_OF_DAY);
        int minuto = gc.get(Calendar.MINUTE);
        return hora + ":" + minuto;
    }

}
