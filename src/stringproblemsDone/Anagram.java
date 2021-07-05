package stringproblemsDone;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Done
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        isAnagram("CAT", "ACT");
        isAnagram("CAT", "ACTA");
        isAnagram("ARMY", "MARY");
        isAnagram("CAT", "BAT");
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean status = true;
        String flag;
        if (str1.length() != str2.length()) {
            status = false;
            flag=" = Not Anagram";
        } else {
            char[] arraySt = str1.toLowerCase().toCharArray();
            char[] arrayDt = str2.toLowerCase().toCharArray();
            Arrays.sort(arraySt);
            Arrays.sort(arrayDt);
            status = Arrays.equals(arraySt, arrayDt);
            flag=" = It's Anagram";
        }
        System.out.println(str1 + " " + str2 + " " + flag);
        return status;
    }
}
