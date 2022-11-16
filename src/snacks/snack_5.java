package snacks;

public class snack_5 {
    public static void main(String[] args) {
        int[] arr = {70, 39, 18, 30, 51, 59, 1, 47, 67, 87};
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("La sommatoria dei valori è: " + sum);

        float average = sum/arr.length;
        System.out.printf("La media dei valori è: " + "%.2f\n", average);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int x = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("L'array ordinato è pari ad: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Il valore maggiore nell'insieme è: " + arr[arr.length-1]);
        System.out.println("Il valore minore nell'insieme è: " + arr[0]);
    }
}
