package stringproblemsDone;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnitTestingStringProblem {
    //Done
    //public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package

    @BeforeClass
    public static void testUnit(){
        System.out.println("*******  We are going to start Unit Testing *****");
    }

    @Before
    public void welcome(){
        System.out.println("Welcome to Unit Testing");
    }

    @Test
    public void testAnagram(){
        boolean actualResult = Anagram.isAnagram("CAT", "ACT");
        boolean expectedResult = true;
        Assert.assertEquals("Test Pass",expectedResult,actualResult);
    }
    @Test
    public void findSmallLarge(){
        String gst="Human brain is a biological learning machine";
        String [] st=gst.split(" ");
        String smalest=st[0];
        String longest="";

        for(String s1:st){
            if(s1.length()<smalest.length()){
                smalest=s1;
            }else if(s1.length()>longest.length()){
                longest=s1;
            }
        }
        System.out.println("Smallest Word of the String is : "+smalest.length()+" "+smalest);
        System.out.println("Longest Word of the String is : "+longest.length()+" "+longest);
    }
    @Test
    public void findDuplicates() {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. " +
                "Java is widely used language";
        System.out.println(st);
        String [] givenString=st.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (String element : givenString) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " +
                        entry.getValue() + " times.");
            }
        }
    }
    @Test
    public void checkPalindrome(){
        String givenString=("CAT");
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
//    @Test
//    public void Permut() {
//        String alpha=" ", name="ABC";
//
//        if (name.length() == 0) {
//            System.out.println(alpha + " ");
//        }
//        for (int i = 0; i < name.length(); i++) {
//            String newName = alpha + name.charAt(i);
//            String newAlpha = name.substring(0, i) + name.substring(i + 1);
//
//            Permut();   // Calling Method within Method
//        }
//    }
}

