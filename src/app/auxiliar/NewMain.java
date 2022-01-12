/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.auxiliar;

import java.util.Random;

/**
 * @author Usuari
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 0;
        while (count < 10) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            for (int i = 0; i < 10; i++) {
                if (numbers[i] == na) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                numbers[count] = na;
                count++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i] + "");
        }

    }
}
