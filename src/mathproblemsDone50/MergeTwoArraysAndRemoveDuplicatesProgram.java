package mathproblemsDone50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArraysAndRemoveDuplicatesProgram {
    // Done
    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}
    public static void main(String[] args) {
        int [] arrayA={1,3,4};
        int [] arrayB={4,5,6,7,8};

        Set<Integer> number1=new HashSet<>();
        number1.addAll(Arrays.asList(new Integer [] {1,3,4}));

        Set<Integer> number2=new HashSet<>();
        number2.addAll(Arrays.asList(new Integer [] {4,5,6,7,8}));

        // To Do Union Set
        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Sorted Array Without Duplicates "+union);
    }
}
