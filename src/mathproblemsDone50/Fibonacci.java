package mathproblemsDone50;

public class Fibonacci {
    //Done
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1 ,2,3,5,8,13
         */
        int firstNum = 0, secondNum = 1, fibonacci;
        System.out.print(firstNum + ", " + secondNum);
        for (int i = 3; i <= 40; i++) {
            fibonacci = firstNum + secondNum;
            System.out.print(", " + fibonacci);
            firstNum = secondNum;
            secondNum = fibonacci;
        }
    }
}
