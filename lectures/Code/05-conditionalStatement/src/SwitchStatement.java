import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        //Switch Statement



//        switch (expression){
//            case value1:
//                //code
//                break;
//            case value2:
//                //code
//                break;
//
//            default:
//                // jab koi case match na kare




//        1. Week Days

//        int day = 3;

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your Days: ");
//
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday...");
//                break;
//
//            case 2:
//                System.out.println("Tuesday...");
//                break;
//            case 3:
//                System.out.println("Wednesday...");
//                break;
//
//            case 4:
//                System.out.println("Thursday...");
//                break;
//
//            case 5:
//                System.out.println("Friday...");
//                break;
//
//            case 6:
//                System.out.println("Saturday...");
//                break;
//
//            case 7:
//
//                System.out.println("Sunday...");
//                break;
//
//            default:
//                System.out.println("Invalid Day...");
//
//        }



        // 2. Calculator




        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");

        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");

        double num2 = sc.nextDouble();


        System.out.print("Enter operator (+, -, *, /): ");

        char operator = sc.next().charAt(0);


        switch (operator){

            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if(num2 != 0){
                    System.out.println("Result = " + (num1 / num2));
                }
                else {
                    System.out.println("Cannot divide by zero...");
                }
                break;

            default:
                System.out.println("Invalid operator...");
        }
    }
}
