public class TableOfANumber {

    static void printTable(int n){

        for(int i = 1; i <= n; i++){

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        printTable(9);

    }
}
