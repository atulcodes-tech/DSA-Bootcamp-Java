public class LeapYear {

    public static void main(String[] args) {

        int start = 2000;

        int end = 2026;

        for(int year = start; year <= end; year++){

            if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                System.out.print(year + " ");
            }
        }
    }
}
