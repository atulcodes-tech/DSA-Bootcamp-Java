import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int num = sc.nextInt();

        int sum = 0;

        for(int i = num; i != 0; i = i / 10){

            int digit = i % 10;

            sum = sum + digit;

        }

        System.out.println(sum);
    }
}