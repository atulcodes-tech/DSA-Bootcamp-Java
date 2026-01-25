import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
//        If_else

//        if(condition){
//            //condition true ho to ye chalega
//        }
//        else {
//            // condition false ho to ye chalega
//        }


//        1. Age check (For Vote)
//
//        int age = 46;
//
//        if(age >= 18){
//            System.out.println("You are eligible to vote...");
//        }
//        else {
//            System.out.println("You are not eligible to vote...");
//        }

//        2. Even or Odd number

//        int num = 6;
//
////        % module % opearator ek remainder deta hai
////        7 % 2 = 1 not zero (false)
////        6 % 2 = 0 (true)
//
//        if(num % 2 == 0){
//            System.out.println("Number is Even...");
//        }
//        else {
//            System.out.println("Number is Odd...");
//        }

//        3. Pass or Fail Input by user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Marks: ");

        int marks = sc.nextInt();

        if(marks >= 40){
            System.out.println("You are pass...");
        }
        else {
            System.out.println("You are fail...");
        }



    }

}
