package problemandsolutionsDone;

import java.util.Scanner;

public class ArithmeticOperator {
    //Done
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.
    public static void main(String[] args) {

        System.out.println("CALCULATOR");

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your First Number  :");
        int num1 = scn.nextInt();

        System.out.print("Enter your Second Number:");
        int num2=scn.nextInt();

        System.out.print("What you want to be?(+ - * /)");
        char sign=scn.next().charAt(0);
        scn.close();

        if (sign == '+'){
            int total=num1+num2;
            System.out.println(total);
        }
        else if (sign == '-'){
            int total=num1-num2;
            System.out.println(total);
        }
        else if (sign == '*'){
            int total=num1*num2;
            System.out.println(total);
        }
        else if (sign == '/'){
            int total=num1/num2;
            System.out.println(total);
        }
    }
}
