package app.logic;

import app.Gui.MainScreen;
import app.Gui.RegistroUsuario;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        String archivo = "user.txt";
        try {
            // Se busca el archivo o se crea de ser necesario

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            // Se lee el archivo en busca del usuario
            System.out.println("paso 1");
            String s;

            while ((s = br.readLine()) != null) {
                // En caso de que si existe un usuario registrado
                usuarioRegistrado = true;
                String line = "";
                String[] values = line.split(",");
                System.out.println(values[1]);
            }
            // Se cierran los buffers (Muy importante)
            br.close();

            // En caso de que no exista un archivo se crea uno
        } catch (FileNotFoundException ex) {
            System.out.println("Creando archivo");
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Sebastian\n20");
                bw.close();
            } catch (IOException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } catch (IOException e) {
            System.out.println("Error al crear y abrir");
        }

        /*-------------------------------------------------------------
        / Inicio del programa
        /-------------------------------------------------------------*/
        if (!usuarioRegistrado) {
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
        } else {
            MainScreen main = new MainScreen(usuario);
            main.setVisible(true);
            main.setLocationRelativeTo(null);

        }
    }
}
