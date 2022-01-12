/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.logic.auxiliar;

/**
 *
 * @author HP
 */
public class Cuento {
    //ESTOS SON LOS CUENTOS NECESARIOS
    

    
 String cuento []={
       "\n\tLos lápcies de colores"
            + "\n\nLos lápices de colores duermen acomodados. "
            + "Uno al lado del otro, con nombre y bien afilados. Por suerte, "
            + "llegó la hora de empezar a trabajar, pintemos muchos dibujos y"
            + " así el cuaderno alegrar. Juan prefiere los lápices de color "
            + "rojo y su hermana Rosita los prefiere de color amarillo, pero "
            + "juntos se unen para crear grandes obras de arte.  ",
     
        "\n      Los cinco sentidos del cuerpo humano"
         + "\n\nLos seres humanos tenemos cinco sentidos: vista, oído, olfato, gusto y tacto.\n" +
"Tenemos sentido de la vista gracias a los ojos, que nos permiten ver todo lo que nos rodea y "
         + "distinguir sus formas, colores, tamaños, si están lejos o cerca…\n" +
"A través del oído nos llegan los sonidos del exterior, como la música, el ruido de"
         + " los coches o el canto de los pájaros.\n" +
"El olfato está en nuestra nariz; por ella se cuelan olores, a veces agradables como "
         + "el que desprende un bizcocho recién horneado, y otros olores apestosos"
         + " que nos resultan molestos.\n" +
"En nuestra boca se encuentra el sentido del gusto, que nos permite distinguir si"
         + " un sabor es dulce, ácido, amargo, picante… y también si el alimento "
         + "nos gusta o no.\n" +
"Por último, el sentido del tacto sirve para saber cómo son los objetos que tocamos"
         + " y percibir algunas de sus cualidades, como, por ejemplo, si son suaves,"
         + " rugosos, duros o blandos.",
        "\n\tMozart, el músico genial"
         + "\n\nMozart fue un músico extraordinario que nació en un país europeo llamado "
         + "Austria hace poco más de 250 años.\n" +
"Desde muy chiquitín demostró un don especial para la música. Con solo cuatro años"
         + " ya era capaz de componer como si fuera un músico adulto y tocaba"
         + " instrumentos tan complicados como el teclado o el violín ¡Un auténtico niño prodigio!\n" +
"Su padre, que también era músico, se esforzó por enseñarle todo lo que sabía. "
         + "Poco tiempo después lo llevó de viaje por Europa para que tocara ante "
         + "los reyes y gobernantes más importantes de la época. Todos se quedaron "
         + "asombrados al comprobar la genialidad del pequeño Mozart y le dedicaron "
         + "miles de aplausos y alabanzas.\n" +
"Tras una infancia repleta de éxitos, Mozart se hizo mayor y siguió dedicándose "
         + "a su gran pasión: la música. Trabajó toda la vida sin descanso y gracias "
         + "a su enorme talento compuso grandes obras maestras.  Una de sus sinfonías"
         + " más importante es Sinfonía ° 40." 
    };
    
  public String getCuento(int parte){
        return cuento[parte];
    }
    
}
