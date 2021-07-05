package datastructureDone;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {
	//Done
	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		try {
			fileReader = new FileReader(textFile);
			bufferedReader = new BufferedReader(fileReader);
			String data;
			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("File not found Exception");
		} finally {
			try{
				fileReader.close();
				bufferedReader.close();
			}catch (Exception e){
				System.out.println("File Already closed");
			}
		}
	}
}
