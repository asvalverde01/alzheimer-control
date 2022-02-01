package app.logic;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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


    /*-------------------------------------------------------------
    /Constructor de la clase Usuario
    /-------------------------------------------------------------*/
    /**
     * Constructor por defecto de la clase Usuario
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario con parametros
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
        return fechaNacimiento.getDia() + "/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAnio();
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
        switch (etapa) {
            case 1:
                return "Moderada";
            case 2:
                return "Avanzada";
            default:
                return "Leve";
        }
    }


    /*-------------------------------------------------------------
    /Métodos capa de negocio
    /-------------------------------------------------------------*/

    /**
     * Recibe el tipo de argumento por el cual se quieren filtrar las busquedas
     * de resultados y regresa una lista con Resutados de Actividades
     *
     * @param tipo String tipo de actividad
     * @return listaResultado
     */
    public List<ResultadoActividad> buscarResultadoActividad(String tipo) {
        listaResultado = new ArrayList<>();

        try {
            // Objeto de una orden SQL
            PreparedStatement st = null;
            // Segun el tipo seleccionado se busca en la base de datos
            try {
                switch (tipo) {
                    case "Todos":
                        st = Main.getConnect().prepareStatement("SELECT * FROM actividad WHERE id = ?");
                        st.setString(1, cedula);
                        break;
                    case "Leve":
                        st = Main.getConnect().prepareStatement("SELECT * FROM actividad WHERE id = ? AND etapa = ?");
                        st.setString(1, cedula);
                        st.setString(2, "Leve");
                        break;
                    case "Moderada":
                        st = Main.getConnect().prepareStatement("SELECT * FROM actividad WHERE id = ? AND etapa = ?");
                        st.setString(1, cedula);
                        st.setString(2, "Moderada");
                        break;
                    case "Hoy":
                        st = Main.getConnect().prepareStatement("SELECT * FROM actividad WHERE id = ? AND dia = ?");
                        st.setString(1, cedula);
                        Fecha fechaHoy = new Fecha();
                        st.setInt(2, fechaHoy.getDia());
                        break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // Ejecuta la orden y la guarda en modo de tabla
            ResultSet rs = st.executeQuery();

            // Mientras hayan filas en la tabla rs
            while (rs.next()) {
                String cedulaRe = rs.getString("id");
                String nombreRe = rs.getString("nombre");
                int aciertos = rs.getInt("aciertos");
                String etapaRe = rs.getString("etapa");
                int segundos = rs.getInt("segundos");
                int dia = rs.getInt("dia");
                int mes = rs.getInt("mes");
                int anio = rs.getInt("anio");
                //Crea un objeto de tipo Fecha
                Fecha fecha = new Fecha(dia, mes, anio);
                //Crea un objeto de tipo ResultadoActividad
                ResultadoActividad resultadoActividad = new ResultadoActividad(cedulaRe, nombreRe, aciertos, fecha, etapaRe, segundos);
                //Agrega el objeto a la lista
                listaResultado.add(resultadoActividad);
            }
        } catch (HeadlessException | SQLException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // regresa la lista de resultados con los valores de la busqueda
        return listaResultado;
    }

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
                case "Nombre":
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET nombre = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    nombre = nuevo;
                    break;
                case "Apellido":
                    st = Main.getConnect().prepareStatement("UPDATE usuario SET apellido = ? WHERE cedula = ?");
                    st.setString(1, nuevo);
                    st.setString(2, cedula);
                    apellido = nuevo;
                    break;
                case "Etapa":
                    // Verifica que el nuevo valor sea valido "Leve" , "Moderada" o "Avanzada"
                    if (nuevo.equals("Leve") || nuevo.equals("Moderada") || nuevo.equals("Avanzada")) {
                        int nuevoValor;
                        switch (nuevo) {
                            case "Moderada":
                                nuevoValor = 1;
                                break;
                            case "Avanzada":
                                nuevoValor = 2;
                                break;
                            default:
                                nuevoValor = 0;
                                break;
                        }
                        st = Main.getConnect().prepareStatement("UPDATE usuario SET etapa = ? WHERE cedula = ?");
                        st.setInt(1, nuevoValor);
                        st.setString(2, cedula);
                        etapa = nuevoValor;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese solamente \"Leve\" - \"Moderada\" - \"Avanzada\"");
                        return false;
                    }
                    break;
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
