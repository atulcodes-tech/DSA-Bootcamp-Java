public class CountZeroDigits {

    public static void main(String[] args) {

        int num = 1020304000;

        int countZero = 0;

        if(num == 0){
            countZero = 1;
        }
        else {
            while (num != 0){
                int digit = num % 10;
                if(digit == 0){
                    countZero++;
                }
                num = num / 10;
            }
        }

        System.out.println("Zero Digits = " + countZero);
    }
}
