package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
    //.5 Done
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */
    public static void main(String[] args) {
        int[] array = {34, -25, 67, 0, 23, 3, 6, -11, 70, 110, 90};
        Sort sot = new Sort();
        sot.selectionSort(array);
        sot.insertionSort(array);
        sot.bubbleSort(array);
        sot.heapSort(array,array.length);
        sot.printSortedArray(array);
    }

    public void selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }
//        for (int ar:array) {
//            System.out.print(ar+", ");
//        }
        System.out.println("\nSelection Sort:");
        System.out.println(Arrays.toString(array));

        // Time Calculation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        System.out.println("Execution Time : " + this.executionTime + " Milli Sec");
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
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
//        for (int n = 0; n < list.length; n++) {
//            System.out.print(list[n] + " ");
//        }
        System.out.println("\nInsertion Sort:");
        System.out.println(Arrays.toString(array));
        //Time Calculation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        System.out.println("Execution Time : " + this.executionTime + " Milli Sec");
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
//        for (int bs : array) {
//            System.out.print(bs + ", ");
//        }
        System.out.println("\nBubble Sort:");
        System.out.println(Arrays.toString(array));
        //Time Calculation
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        System.out.println("Execution Time : " + this.executionTime + " Milli Sec");
        return list;
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] quickSort(int[] array) {
        int[] list = array;
        //implement here

        return list;
    }

    public int[] heapSort(int[] array, int size) {
        int[] list = array;
        //implement here
        for (int i = size / 2 - 1; i > 0; i--) {
            heapify(array, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        System.out.println("\nHeap Sort:");
        System.out.println(Arrays.toString(array));
        return list;
    }
    static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }


    public int[] bucketSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }

    public static void printSortedArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}
