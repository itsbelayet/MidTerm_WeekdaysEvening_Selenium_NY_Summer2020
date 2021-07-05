package stringproblemsDone;

public class Permutation {
    //Done
    /*
     * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * Write Java program to compute all Permutation of a String
     *
     */
    public static void main(String[] args) {
        Permut("", "ABC");
    }

    static void Permut(String alpha, String name) {

        if (name.length() == 0) {
            System.out.println(alpha + " ");
        }
        for (int i = 0; i < name.length(); i++) {
            String newName = alpha + name.charAt(i);
            String newAlpha = name.substring(0, i) + name.substring(i + 1);

            Permut(newName, newAlpha);   // Calling Method within Method
        }
    }
}
