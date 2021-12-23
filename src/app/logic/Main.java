package app.logic;

import app.Gui.MainScreen;
import app.Gui.RegistroUsuario;

public class Main {
    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos de la clase Main
        /-------------------------------------------------------------*/
        Usuario usuario = new Usuario();
        
        
        
        boolean usuarioRegistrado = false;
        
        /*-------------------------------------------------------------
        / Inicio del programa
        /-------------------------------------------------------------*/
        
        if (!usuarioRegistrado) {
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
            registro.setLocationRelativeTo(null);
        } else {
            MainScreen main =  new MainScreen(usuario);
            main.setVisible(true);
            main.setLocationRelativeTo(null);
            
        }
    }
}