package app.test;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        int[] numbers = getCardNumbers();
    }

    public static int[] getCardNumbers() {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 6);
            System.out.println("Number " + numbers[i]);
            System.out.println("Number " + numbers[i]);
        }
        return numbers;
    }
}
