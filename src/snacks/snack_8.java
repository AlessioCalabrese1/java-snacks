package snacks;

import java.util.Random;

public class snack_8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int rndNum = rnd.nextInt(100) - 50;
            arr[i] = rndNum;
        }

        //Riordino l'array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int x = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("L'array di elementi da -50 a 50 è: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Il valore assoluto maggiore è: " + arr[0]);
        System.out.println("Il valore assoluto minore è " + arr[arr.length-1]);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]%5) == 0) {
                sum += arr[i];
            }
        }
        System.out.println("La sommatoria dei multipli di 5 è: " + sum);
    }
}
