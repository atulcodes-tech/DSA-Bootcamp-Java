public class ArmStrongNumber {

    public static void main(String[] args) {

        int num = 122;

        int original = num;

        int sum = 0;

//        Step 1 : Count Digits

        int digits = 0;
        int temp = num;

        while (temp != 0){
            digits++;
            temp = temp / 10;
        }


        // Step2 : Armstrong logic

        while (num != 0){

            int digit = num % 10;

            int power = 1;

            for(int i = 1; i <= digits; i++){

                power = power * digit;
            }

            sum = sum + power;

            num = num / 10;
        }

        // Step3: check

        if(sum == original){
            System.out.println("Armstrong Number...");
        }
        else {
            System.out.println("Not an ArmStrong Number...");
        }
    }
}
