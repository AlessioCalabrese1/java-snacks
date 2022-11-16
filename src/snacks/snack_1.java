package snacks;

import java.util.Scanner;

public class snack_1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserire un numero:");
        int number = sn.nextInt();

        if ((number % 2) == 0) {
            System.out.println(number);
        }else{
            System.out.println((number+1));
        }
    }
}
