package mathproblemsDone50;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		//.5 Done
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 *
 		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		int[] number={211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		minimum(number);
	}
	static void minimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The Lowest number of this array is : "+min);
	}

/**
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}
 **/

		int array[]=new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		//find lowest number from the array
		//System.out.println("Smallest: "+getSmallest(array,26));
		int temp, size;
		size = array.length;
		for(int i = 0; i<size; i++ ){
			for(int j = i+1; j<size; j++){
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Smallest number of the array is :" +array[0]);
		ConnectToSqlDB connectToSqlDB=new ConnectToSqlDB();
		List<String> lowestValue=new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue=connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for (String st : lowestValue) {
			System.out.println(st);
		}
	}

}

