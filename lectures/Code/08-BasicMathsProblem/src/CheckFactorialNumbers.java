public class CheckFactorialNumbers {

    public static void main(String[] args) {
//        int N = 4;
//
//        int fact = 1;
//
//        for (int i = 1; i <= N; i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);


        int N = 5;

        int i = 1;

        int fact = 1;

        while ( i <= N){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
