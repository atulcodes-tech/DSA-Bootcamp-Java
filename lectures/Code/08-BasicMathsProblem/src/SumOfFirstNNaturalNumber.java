import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class SumOfFirstNNaturalNumber {

    public static void main(String[] args) {

//        int N = 10;
//
//        int sum = 0;
//
//        for (int i = 1; i <= N; i++){
//
//            sum = sum + i;
//
//        }
//        System.out.println(sum);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Natural Number: ");

        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i<= N; i++){
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
