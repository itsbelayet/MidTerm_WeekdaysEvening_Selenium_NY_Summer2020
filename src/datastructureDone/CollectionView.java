package datastructureDone;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        //Done
        /*
         Map is created and inserted some data. Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nAnother Approach");
        for (Integer st : map.keySet()) {
            System.out.println(st + " : " + map.get(st));
        }
    }
}
