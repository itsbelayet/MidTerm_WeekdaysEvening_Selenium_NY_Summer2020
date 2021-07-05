package algorithm;


import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class UnitTestSorting {
    static int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
//    public static void main(String[] args) {
//        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
//        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
//
//        //Create Sort object
//        Sort sort = new Sort();
//
//        //apply unsorted array to selectionSort.
//        sort.selectionSort(unSortedArray);
//        //System.out.println(Arrays.toString(sortedArray));
//        //verify if the unsorted array is sorted by the selection sort algorithm.
//
//        try {
//            //Assert.assertEquals("Not Sorted",Arrays.toString(sorted),Arrays.toString(unSort));
//            Assert.assertEquals("Array is not Sorted", Arrays.toString(sortedArray), Arrays.toString(unSortedArray));
//        }catch(Exception ex){
//            //ex.getMessage();
//            System.out.println(ex);
//        }
//        //Now implement Unit test for rest of the soring algorithm...................below
//        UnitTestSorting.insertionSort(unSortedArray);
//        UnitTestSorting.bubble(unSortedArray);
//    }
    @Test
    public static int[] insertionSort(int[] unSortedArray) {
        final long startTime = System.currentTimeMillis();
        int[] list = unSortedArray;
        //implement here
        for (int i = 0; i < list.length; i++) {
            int j = i - 1;
            int point = list[i];
            while (j >= 0 && list[j] > point) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = point;
        }
        Assert.assertEquals("Test Fail", Arrays.toString(sortedArray), Arrays.toString(unSortedArray));
        return list;
    }

    @Test
    public static int[] bubble(int[] unSortedArray) {
        final long startTime = System.currentTimeMillis();
        int[] list = unSortedArray;
        //implement here
        for (int i = 0; i < unSortedArray.length - 1; i++) {
            for (int j = 0; j < unSortedArray.length - 1 - i; j++) {
                if (unSortedArray[j] > unSortedArray[j + 1]) {
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j + 1];
                    unSortedArray[j + 1] = temp;
                }
            }
        }
        Assert.assertEquals("Test Fail", Arrays.toString(sortedArray), Arrays.toString(unSortedArray));
        return list;
    }
}
