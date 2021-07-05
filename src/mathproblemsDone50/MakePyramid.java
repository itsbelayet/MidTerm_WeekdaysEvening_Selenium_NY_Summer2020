package mathproblemsDone50;

public class MakePyramid {
    public static void main(String[] args) {
        //Done
        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        for (int i = 1; i <= 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
