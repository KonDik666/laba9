package tasks;

import java.util.Random;


public class task3 {

    //private static int step = 0;

    public static void arrInput(int[] array, int index){

        Random rand = new Random();

        if (index < array.length) {
            array[index] = rand.nextInt(10);
            //System.out.println(array[index]);
            arrInput(array, index + 1);
        }


    }

    public static void arrOutput(int[] array, int index){
        if (index < array.length) {
            System.out.println(array[index]);
            arrOutput(array, index + 1);
        }
    }

    public static void arrInput(int[] array) { //перегрузка метода arrInput, чтобы второе значение по умолчанию было 0
        arrInput(array, 0); //для праивльной работы вторым параметром всегда задавать 0
    }

    public static void arrOutput(int[] array) { //перегрузка метода arrOutput, чтобы второе значение по умолчанию было 0
        arrOutput(array, 0); //для праивльной работы вторым параметром всегда задавать 0
    }

    static void main(String[] args) {
        int[] array = new int[10];
        arrInput(array);
        System.out.println("---------------------------------");
        arrOutput(array);
        System.out.println("---------------------------------");
    }

}
