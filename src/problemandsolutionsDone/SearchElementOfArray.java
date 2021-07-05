package problemandsolutionsDone;

import java.util.Scanner;

public class SearchElementOfArray {
    //Done
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.

    public static void main(String[] args) {
        // Linear Search
        boolean isPresent = false;
        int index = 0;
        int arr[]={17,4,7,10,13,16,1,20,23,26};
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number to be search : ");
        int number=input.nextInt();

        for(int i=0; i<arr.length; i++){
            if (arr[i]==number){
                isPresent=true;
                index=i;
            }
        }
        if (isPresent==true){
            System.out.println("Element is Present at index : "+index);
        }else{
            System.out.println("Element is not Present");
        }
    }
}
