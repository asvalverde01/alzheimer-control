
package app.logic.auxiliar;

import java.util.Random;

public class LogicaJuego {
    public static int[] getCardNumbers(){
       int[] numbers = new int[10];
        int count = 0;
        
        while(count < numbers.length) {
            Random r = new Random();
            int na = r.nextInt(5) + 1;
            int nvr = 0;
            
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        for (int i = 0; i < numbers.length; i++) {
        }
        
        
        return numbers;
    }
}
