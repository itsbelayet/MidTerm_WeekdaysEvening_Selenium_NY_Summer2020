package mathproblemsDone50;
public class Factorial {
    //Done
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int fa=5;
        fa=fa*4;
        fa=fa*3;
        fa=fa*2;
        fa=fa*1;
        System.out.println("Factorial of 5 is :"+fa);

        //Another Way
        int fact=1;
        for (int i=5;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of 5 is :"+fact);
    }
}
