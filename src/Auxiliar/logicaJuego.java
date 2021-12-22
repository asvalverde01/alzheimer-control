
package Auxiliar;

import java.util.Random;

public class logicaJuego {
    public int[] getCardNumbers(){
        int [] numbers= new int[10];
        /*int count =0;
        while(count<10){
            Random r= new Random();
            int na=r.nextInt(8)+1;
            int nvr=0; 
            for(int i=0;i<10;i++){
                if(numbers[i]==na){
                    nvr++;
                }
            }
            if(nvr<2){
                numbers[count]=na;
                count++;
            }
        }*/
        // En el arreglo de 10 números se asignan valores aleatorios del 0 - 5
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 6);
        }
        return numbers;
    }
}
