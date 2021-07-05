package problemandsolutionsDone;

import java.util.Scanner;

public class GradeSheet {
    // Done
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //See the example output below:
    //Quiz score: 80
     //Mid-term score: 68
     //Final score: 90
    //Your grade is B.
    public static void main(String[] args) {
        GradeSheet.checkScore();
    }
    public static void checkScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Quiz score: ");
        int quiz = input.nextInt();
        System.out.print("Enter Mid-term score: ");
        int mterm = input.nextInt();
        System.out.print("Enter Final score: ");
        int finalScore = input.nextInt();
        input.close();
        if ((quiz + mterm + finalScore) / 3 >= 90) {
            System.out.println("Your grade is A");
        } else if ((quiz + mterm + finalScore) / 3 >= 70 && (quiz + mterm + finalScore) / 3 < 90) {
            System.out.println("Your grade is B");
        } else if ((quiz + mterm + finalScore) / 3 >= 50 && (quiz + mterm + finalScore) / 3 < 70) {
            System.out.println("Your grade is C");
        } else if ((quiz + mterm + finalScore) / 3 < 50) {
            System.out.println("Your grade is F");
        }
    }
}
