package mathproblemsDone50;

public class FindMissingNumber {

    public static void main(String[] args) {
        //Done
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array
         * (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        findMissingNumber(array);
    }

    public static void findMissingNumber(int[] array){
        int n = array.length + 1;
        int sum = (n * (n+1))/2;
        for(int i = 0; i < array.length; i++) {
            sum = sum - array[i];
        }
        System.out.println( " Missing number is " + sum);
    }
}
