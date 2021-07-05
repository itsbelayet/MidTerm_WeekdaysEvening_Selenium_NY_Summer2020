package datastructureDone;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    //Done
    /*
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     * Store all the sorted data into one of the databases.
     */
    public static void main(String[] args) {

        arrList();

    }

    public static void arrList() {
        ArrayList<String> stuList = new ArrayList<String>();
        stuList.add("Ala");
        stuList.add("sadia");
        stuList.add("Rois");
        stuList.add("Enayet");
        stuList.add("Zakir");
        stuList.add("Belayet");


        System.out.println("\nRemove Belayet -> " + stuList.remove("Belayet"));
        System.out.println("Add Mosharaf -> " + stuList.add("Mosharaf"));

        System.out.println("\n*** List data use for each loop ****");
        for (String st : stuList) {
            System.out.println("Student name : " + st);
        }

        System.out.println("\n*** List data using Iterator loop ****");

        Iterator itr = stuList.iterator();
        while (itr.hasNext()) {
            System.out.println("Name is : " + itr.next());
        }

        System.out.println("\n*** List data using while loop ****");
        int i = 0;
        while (i < stuList.size()) {
            System.out.println("Name : " + stuList.get(i));
            i++;
        }

    }
}
