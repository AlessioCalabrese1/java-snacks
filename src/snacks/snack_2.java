package snacks;

import java.util.Random;

public class snack_2 {
    public static void main(String[] args) {
        String[] names = {"Papà", "Zio", "Pinco"};
        String[] surnames = {"Catoro", "Pera", "Pallino"};

        for (int i = 0; i < names.length; i++) {
            Random rnd = new Random();
            int rndName = rnd.nextInt(names.length);
            int rndSurname = rnd.nextInt(surnames.length);
            System.out.println(names[rndName] + " " + surnames[rndSurname]);
        }
    }
}
