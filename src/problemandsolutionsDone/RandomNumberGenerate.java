package problemandsolutionsDone;

import java.util.Random;

public class RandomNumberGenerate {
    //Done
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        double [] stId=new double[5];
        Random random=new Random(1);
        for (int i=0; i<stId.length; i++){
            stId[i]=random.nextInt(8);
            System.out.println(stId[i]);
        }
        System.out.println(Math.random());
        System.out.println("NY101"+Math.random());
    }


}
