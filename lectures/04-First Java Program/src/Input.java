import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

//        Scanner user = new Scanner(System.in);

//        System.out.print("Enter the Value: ");
//
//        float value = sc.nextFloat();
//
//        System.out.println(value);
//

//        System.out.print("Enter Your Age: ");
//
//        int age = user.nextInt();
//
//        System.out.println("Age: " + age);


//        1. Add a two number taken by user


//        Scanner user = new Scanner(System.in);
//
//        System.out.print("Enter Your First Number: ");
//
//        double num1 = user.nextDouble();
//
//        System.out.print("Enter Your Second Number: ");
//
//        double num2 = user.nextDouble();
//
//        double sum = num1 + num2;
//
//        System.out.println("Sum of Two numbers: " + sum);


//        2. Take a name and age of user

        Scanner user = new Scanner(System.in);

        System.out.print("Enter Your Name: ");

        String name = user.nextLine();

        System.out.print("Enter Your Age: ");

        int age = user.nextInt();

        System.out.printf("Name: %s, Age: %d" , name, age);
    }
}
