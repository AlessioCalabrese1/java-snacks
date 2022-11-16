package snacks;

import java.util.Random;

public class snack_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndNmbA = rnd.nextInt(15);
        int rndNmbB = rnd.nextInt(15);
        int[] a = new int[rndNmbA];
        int[] b = new int[rndNmbB];
        
        System.out.println("La lunghezza di a è: " + a.length + "\nLa lunghezza di b è: " + b.length);

        if ((a.length - b.length) >= 0) {
            for (int i = 0; i < (a.length - b.length); i++) {
                System.out.println((i+1) + " : " + rnd.nextInt(100));
            }
        }else{
            for (int i = 0; i < (b.length - a.length); i++) {
                System.out.println((i+1) + " : " + rnd.nextInt(100));
            }
        }
    }
}
