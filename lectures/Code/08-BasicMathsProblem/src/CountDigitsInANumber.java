public class CountDigitsInANumber {

    public static void main(String[] args) {

        int num = 123455642;

        int count = 0;

        while (num != 0){
            num = num /10;
            count++;
        }

        System.out.println(count);
    }
}
