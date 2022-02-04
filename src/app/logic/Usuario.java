package app.logic;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Programa BrainUP Clase Usuario
 *
 * @author Valverde, Vinueza, Vintimilla
 */
public class Usuario {

    /*-------------------------------------------------------------
    /Atributos de la clase Usuario :)
    /-------------------------------------------------------------*/
    private String cedula;
    private String nombre;
    private String apellido;
    private int avatar;
    private int etapa;
    private Fecha fechaNacimiento;
    // Lista de ResultadoActividad (Almacena una lista con los resultados de las actividades realizadas por el usuario)
    private List<ResultadoActividad> listaResultado;

    /**
     * Constructor por defecto de la clase Usuario
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario con parametros
     *
     * @param cedula String
     * @param nombre String
     * @param apellido String
     * @param avatar int
     * @param etapa int
     * @param fechaNacimiento Fecha
     */
    public Usuario(String cedula, String nombre, String apellido, int avatar, int etapa, Fecha fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.avatar = avatar;
        this.etapa = etapa;
        this.fechaNacimiento = fechaNacimiento;
    }

    /*-------------------------------------------------------------
    /Constructor de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Método que agrega un resultado a la lista del Usuario
     *
     * @param listaResultado recibe una lista de los resultados de Actividades 
     */
    public void setListaResultado(List<ResultadoActividad> listaResultado) {
        this.listaResultado = listaResultado;
    }

    /*-------------------------------------------------------------
    /Métodos get y set de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Regresa el nombre del usuario
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del usuario
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el apellido del usuario
     *
     * @return String apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Asigna el apellido del usuario
     *
     * @param apellido String
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Regresa la cedula del usuario
     *
     * @return String cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Asigna la cedula en el usuario
     *
     * @param cedula String cedula nueva
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Regresa el avatar del usuario
     *
     * @return String avatar
     */
    public int getAvatar() {
        return avatar;
    }

    /**
     * Asigna el avatar del usuario
     *
     * @param avatar String
     */
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /**
     * Regresa la fecha de nacimiento del usuario como String
     *
     * @return String fechaNacimiento
     */
    public String getFechaNacimientoString() {
        return fechaNacimiento.toString();
    }

    /**
     * Regresa la fecha de nacimiento del usuario
     *
     * @return Fecha fechaNacimiento
     */
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Asigna la fecha de nacimiento del usuario
     *
     * @param fechaNacimiento Fecha
     */
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa la edad del usuario calculada con el metodo
     * calcularEdad(fechaNacimiento)
     *
     * @return int edad
     */
    public int getEdad() {
        return fechaNacimiento.diferenciaEntreFechas(fechaNacimiento);
    }

    /**
     * Regresa la etapa del usuario
     *
     * @return int etapa
     */
    public int getEtapa() {
        return etapa;
    }

    /**
     * Asigna la etapa del usuario
     *
     * @param etapa int
     */
    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    /**
     * Regresa la etapa del usuario en modo de String
     *
     * @return String etapa
     */
    public String getEtapaUsuario() {
        return switch (etapa) {
            case 1 ->
                "Moderada";
            case 2 ->
                "Avanzada";
            default ->
                "Leve";
        };
    }


    /*-------------------------------------------------------------
    /Métodos capa de negocio
    /-------------------------------------------------------------*/
    /**
     * Metodo que permite modificar un atributo del usuario
     *
     * @param tipo String tipo de atributo
     * @param nuevo String nuevo valor a cambiar
     * @return Boolean true si se modifico correctamente false si no
     */
    public boolean modificarInfoUsuario(String tipo, String nuevo) {
        // Modifica el atributo seleccionado en la base de datos
        try {
            PreparedStatement st = null;
            switch (tipo) {
                case "Nombre" -> {
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET nombre = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    nombre = nuevo;
                }
                case "Apellido" -> {
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET apellido = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    apellido = nuevo;
                }
                case "Etapa" -> {
                    // Verifica que el nuevo valor sea valido "Leve" , "Moderada" o "Avanzada"
                    if (nuevo.equals("Leve") || nuevo.equals("Moderada") || nuevo.equals("Avanzada")) {
                        int nuevoValor;
                        nuevoValor = switch (nuevo) {
                            case "Moderada" ->
                                1;
                            case "Avanzada" ->
                                2;
                            default ->
                                0;
                        };
                        st = Main.getConnect().prepareStatement("UPDATE usuario SET etapa = ? WHERE cedula = ?");
                        st.setInt(1, nuevoValor);
                        st.setString(2, cedula);
                        etapa = nuevoValor;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese solamente \"Leve\" - \"Moderada\" - \"Avanzada\"");
                        return false;
                    }
                }
                case "fecha" -> {
                    //Separa el string si encuentra "/"
                    String[] fecha = nuevo.split("/");
                    // Asigna los valores de dia, mes y anio
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    System.out.println(dia + " " + mes + " " + anio);
                    // Hace los cambios en el SQL
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET dianac = ?, mesnac = ?, anionac = ? WHERE cedula = ?");
                    st.setInt(1, dia);
                    st.setInt(2, mes);
                    st.setInt(3, anio);
                    st.setString(4, cedula);
                    this.fechaNacimiento.setDia(dia);
                    this.fechaNacimiento.setMes(mes);
                    this.fechaNacimiento.setAnio(anio);
                }
            }
            // Ejecuta la consulta
            try {
                assert st != null;
                // Ejecuta la consulta SQL
                st.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    /**
     * Metodo que permite agregar un resultado a la lista de resultados de
     * actividad del Usuario
     *
     * @param resultado Resultado a agregar
     */
    public void agregarResultadoLista(ResultadoActividad resultado) {
        // Agrega a la listaResultado el resultado de la actividad
        listaResultado.add(resultado);
    }

    /**
     * Recibe el tipo de argumento por el cual se quieren filtrar las búsquedas
     * de resultados y regresa una lista con Resultados de Actividades
     *
     * @param filtro String filtro de actividades a buscar
     * @return listaResultadoFiltro
     */
    public List<ResultadoActividad> buscarResultadoActividad(String filtro) {
        List<ResultadoActividad> listaResultadoFiltro = new ArrayList<>();

        try {
            switch (filtro) {
                case "Todos" -> {
                    // Regresa la lista de resultados de actividades
                    return listaResultado;
                }

                case "Leve", "Moderada" -> {
                    // Recorre la lista de resultados de actividades
                    for (ResultadoActividad resultado : listaResultado) {
                        // Si el resultado de la actividad es del tipo filtro
                        if (resultado.getEtapa().equals(filtro)) {
                            // Agrega el resultado a la lista de resultados filtrados
                            listaResultadoFiltro.add(resultado);
                        }
                    }
                    // Regresa la lista de resultados filtrados
                    return listaResultadoFiltro;
                }

                case "Hoy" -> {
                    // Recorre la lista de resultados de actividades
                    for (ResultadoActividad resultado : listaResultado) {
                        // Si el resultado de la actividad es del tipo filtro
                        if (resultado.getFecha().getDia() == (new Fecha()).getDia()) {
                            // Agrega el resultado a la lista de resultados filtrados
                            listaResultadoFiltro.add(resultado);
                        }
                    }
                    return listaResultadoFiltro;
                }

                case "Identificar Letras", "Reconocer sonido", "Identificar colores", "Suma Resta", "Comprensión", "Memoria" -> {
                    // Recorre la lista de resultados de actividades
                    for (ResultadoActividad resultado : listaResultado) {
                        // Si el resultado de la actividad es del tipo filtro
                        if (resultado.getNombre().equals(filtro)) {
                            // Agrega el resultado a la lista de resultados filtrados
                            listaResultadoFiltro.add(resultado);
                        }
                    }
                    // Regresa la lista de resultados filtrados
                    return listaResultadoFiltro;
                }
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listaResultadoFiltro;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------Mover al Main
    /**
     * Metodo que elimina el usuario de la base de datos
     *
     * @return Boolean true si se elimino correctamente
     */
    public boolean eliminarUsuarioDataBase() {
        try {
            // Elimina el usuario
            PreparedStatement st = Main.getConnect().prepareStatement("DELETE FROM usuario WHERE cedula = ?");
            st.setString(1, cedula);
            // Ejecuta la consulta SQL
            st.executeUpdate();
            // Elimina las actividades del usuario
            st = Main.getConnect().prepareStatement("DELETE FROM actividad WHERE id = ?");
            st.setString(1, cedula);
            // Ejecuta la consulta SQL
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Regresa los valores de usuario
     *
     * @return String info usuario
     */
    @Override
    public String toString() {
        return cedula + "      " + nombre + "       " + apellido + "          " + getEdad() + "     " + getEtapaUsuario();
    }
}
