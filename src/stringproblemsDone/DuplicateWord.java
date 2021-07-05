package stringproblemsDone;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        // Done .5
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. " +
                "Java is widely used language";
        System.out.println(st);
        String [] givenString=st.split(" ");
        findDuplicates(givenString);
    }

    private static void findDuplicates(String[] inputArray) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String element : inputArray) {
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
}
