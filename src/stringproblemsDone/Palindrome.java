package stringproblemsDone;

public class Palindrome {
    public static void main(String[] args) {
        //Done
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome.
          For example, MOM,DAD,MADAM are Palindrome.
          So write java code to check if a given String is Palindrome or not.
         */
        checkPalindrome("MOM");
        checkPalindrome("DAD");
        checkPalindrome("MADAM");
        checkPalindrome("CAT");
    }
    static void checkPalindrome(String givenString){
        String reversString="";
        for (int i=givenString.length()-1; i>=0; i--){
            reversString=reversString+givenString.charAt(i);
        }
        System.out.println("\n---------------------------------");
        boolean flag=givenString.equals(reversString);
        if (flag==true){
            System.out.println(givenString+" is Palindrom");
        }else {
            System.out.println(givenString+" is not a Palindrom");
        }
    }
}
