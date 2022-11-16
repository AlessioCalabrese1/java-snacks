package snacks;

public class snack_6 {
    public static void main(String[] args) {
        int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
        int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };

        int[] arrSum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }

        System.out.println("L'array sommatoria è pari ad: ");
        for (int i = 0; i < arrSum.length; i++) {
            System.out.println(arrSum[i]);
        }

        //Riordino il primo array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length-1; j++) {
                if (arr1[j] > arr1[j+1]) {
                    int x = arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = x;
                }
            }
        }
        System.out.println("Il valore massimo del primo array è: " + arr1[arr1.length - 1]);
        System.out.println("Il valore minimo del primo array è: " + arr1[0]);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length-1; j++) {
                if (arr2[j] > arr2[j+1]) {
                    int x = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = x;
                }
            }
        }
        System.out.println("Il valore massimo del secondo array è: " + arr2[arr2.length - 1]);
        System.out.println("Il valore minimo del secondo array è: " + arr2[0]);

        int average = 0;
        for (int i = 0; i < arr1.length; i++) {
            average += arr1[i];
            average += arr2[i];
        }

        System.out.printf("La somma degli elementi degli array è: %d\n", average);
        System.out.printf("La media degli array è: %.2f\n", (float)(average/(arr1.length + arr2.length)));
    }
}
