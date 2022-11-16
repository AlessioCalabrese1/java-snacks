package snacks;

public class snack_7 {
    public static void main(String[] args) {
        String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str += words[i];
            str += " ";
        }
        System.out.println("La stringa risultante è: " + str);

        str = "";
        for (int i = words.length - 1; i >= 0; i--) {
            str += words[i];
            str += " ";
        }
        System.out.println("La stringa INVERSA risultante è: " + str);

        String strMax = "";
        for (int i = 0; i < words.length; i++) {
            if (strMax.length() < words[i].length()) {
                strMax = words[i];
            }
        }
        System.out.println("La stringa più lunga è: " + strMax + " lunga " + strMax.length() + " caratteri!");

        String strMin = strMax;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < strMin.length()) {
                strMin = words[i];
            }
        }
        System.out.println("La stringa più corta è: " + strMin + " lunga " + strMin.length() + " caratteri!");
    }
}
