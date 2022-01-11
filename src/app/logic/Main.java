package app.logic;

import app.Gui.MainScreen;
import app.Gui.RegistroUsuario;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos de la clase Main
        /-------------------------------------------------------------*/
        Usuario usuario = new Usuario();
        boolean usuarioRegistrado = false;

        /*-------------------------------------------------------------
            /Se busca el archivo que busca al usuario
            /-------------------------------------------------------------*/
        String archivo = "user.csv";
        String line;
        line = "";
        try {
            // Se busca el archivo o se crea de ser necesario

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            // Se lee el archivo en busca del usuario
            // En caso de que si existe un usuario registrado
            if ((br.readLine()) != null) {
                usuarioRegistrado = true;
            }

            while ((line = br.readLine()) != null) {
                int cont = 0;
                String[] row = line.split(",");
                // Inicializa los valores del objeto usuario
                try {
                    usuario.setNombre(row[0]);
                    usuario.setApellido(row[1]);
                    usuario.setEtapa(parseInt(row[5]));

                    Fecha nacimiento = new Fecha();
                    nacimiento.setDia(parseInt(row[2]));
                    nacimiento.setMes(parseInt(row[3]));
                    nacimiento.setAnio(parseInt(row[4]));
                    try {
                        usuario.setFechaNacimiento(nacimiento);
                    } catch (Exception e) {
                        System.out.println("Error, en fecha (Posible error en formato)");
                    }
                } catch (Exception e) {
                    System.out.println("Error al asignar");
                }
            }
            // Se cierran los buffers (Muy importante)
            br.close();

            // En caso de que no exista un archivo se crea uno
        } catch (FileNotFoundException ex) {
            // Registra al usuario creando un nuevo documento
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
            return;
        } catch (IOException e) {
            System.out.println("Error al crear y abrir");
        } catch (Exception ne) {
            ne.printStackTrace();
        } finally {
            //
        }

        /*-------------------------------------------------------------
        / Inicio del programa
        /-------------------------------------------------------------*/
        if (usuarioRegistrado) {
            MainScreen main = new MainScreen(usuario);
            main.setVisible(true);
            main.setLocationRelativeTo(null);
        } else {
            System.out.println("Error en main");
        }
    }
}
