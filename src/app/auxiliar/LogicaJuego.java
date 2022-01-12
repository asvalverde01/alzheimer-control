package app.auxiliar;

import java.util.Random;

public class LogicaJuego {
    public static int[] getCardNumbers() {
        int[] numbers = new int[10];
        int count = 0;

        while (count < numbers.length) {
            Random r = new Random();
            int na = r.nextInt(5) + 1;
            int nvr = 0;

            for (int number : numbers) {
                if (number == na) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin

        }//fin while
        return numbers;
    }
}
