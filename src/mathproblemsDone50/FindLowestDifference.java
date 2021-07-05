package mathproblemsDone50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        Set<Integer> number1=new HashSet<>();
        number1.addAll(    Arrays.asList(   new Integer [] {30,12,5,9,2,20,33,1}     )     );

        Set<Integer> number2=new HashSet<>();
        number2.addAll(Arrays.asList(new Integer [] {18,25,41,47,17,36,14,19}));

        // To Do Union Set
        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two Set "+union);

        // To Do Symmetric Difference
        Set<Integer> difference= new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two Set "+difference);
    }
}
