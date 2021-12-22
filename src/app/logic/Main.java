package app.logic;

import app.Gui.MainScreen;
import app.Gui.RegistroUsuario;

public class Main {
    public static void main(String[] args) {
        /*-------------------------------------------------------------
        /Atributos de la clase Main
        /-------------------------------------------------------------*/
        Usuario usuario = new Usuario();
        
        MainScreen main =  new MainScreen();
        
        boolean usuarioRegistrado = false;
        
        /*-------------------------------------------------------------
        / Inicio del programa
        /-------------------------------------------------------------*/
        
        if (!usuarioRegistrado) {
            RegistroUsuario registro = new RegistroUsuario(usuario);
            registro.setVisible(true);
        } else {
            main.setVisible(true);
            
        }
    }
}