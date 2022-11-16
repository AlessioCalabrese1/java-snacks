import java.util.Random;
import java.util.Scanner;

public class snacks {
    public static void main(String[] args) {

        //Snack 1

        // Scanner sn = new Scanner(System.in);
        // System.out.println("Inserire un numero:");
        // int number = sn.nextInt();

        // if ((number % 2) == 0) {
        //     System.out.println(number);
        // }else{
        //     System.out.println((number+1));
        // }


        //Snack 2

        // String[] names = {"Papà", "Zio", "Pinco"};
        // String[] surnames = {"Catoro", "Pera", "Pallino"};

        // for (int i = 0; i < names.length; i++) {
        //     Random rnd = new Random();
        //     int rndName = rnd.nextInt(names.length);
        //     int rndSurname = rnd.nextInt(surnames.length);
        //     System.out.println(names[rndName] + " " + surnames[rndSurname]);
        // }


        //Snack 3

        int[] nmb = {1,2,3,4,5,6,7,8,9};
        
        int sumDis = 0; 
        for (int i = 0; i < nmb.length; i++) {
            if ((i % 2) == 1) {
                sumDis += nmb[i]; 
            }
        }

        System.out.println("La somma dei numeri dispari è: " + sumDis);
    }
}
