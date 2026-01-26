public class ReverseNumber {

    public static void main(String[] args) {

        int num = 12345;

        int rev = 0;

        while (num !=  0){

            int digit = num % 10; // last digit

            rev = rev * 10 + digit; // reverse concert

            num = num/ 10; // last digit
        }
        System.out.println(rev);
    }
}
