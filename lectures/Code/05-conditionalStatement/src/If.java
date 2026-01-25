import java.util.Scanner;

public class If {

    public static void main(String[] args) {
//        if

//        syntax
//        if(condition){
//            //code execute hoga agar condition true hai
//        }

//        1. Age Check

//        int age  = 10;
//
//        if(age >= 18){
//            System.out.println("You are eligible to vote..");
//        }

//        2. Positive number check

//        int num = -5;
//
//        if (num > 0) {
//            System.out.println("Number is positive...");
//        }

//        3. Marks

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");

        int marks = sc.nextInt();

        if (marks >= 33){
            System.out.println("You are pass");
        }


    }
}
