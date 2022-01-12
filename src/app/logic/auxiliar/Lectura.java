package app.logic.auxiliar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lectura {

    public static int numeroReal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0;
        if (input.matches("\\d+")) { // it checks if the input line contains only digits
            number = Integer.parseInt(input);
            System.out.println(number + 1);
        } else {
            System.out.println("Incorrect number: " + input);
        }
        return number;
    }

    // Metodo para leer un double y validarlo Lee hasta que se ingrese un valor double
    public static double leerDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean flag = true;
        while (flag || numero < 0) {
            try {
                System.out.println(mensaje);
                numero = scanner.nextDouble();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un numero");
                scanner.nextLine();
            }
        }
        return numero;
    }

    // Metodo para leer un double y validarlo Lee hasta que se ingrese un valor double
    public static double leerDoubleReal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(mensaje);
                numero = scanner.nextDouble();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un numero");
                scanner.nextLine();
            }
        }
        return numero;
    }

}
