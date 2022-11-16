package snacks;

public class snack_3 {
    public static void main(String[] args) {
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
