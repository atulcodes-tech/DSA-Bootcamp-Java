public class GCDAndHCF {

    public static void main(String[] args) {

        int a = 12;

        int b = 18;

        int hcf = 1;

        int min = (a < b) ? a : b;

        for(int i = 1; i <= min; i++){

            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);
    }
}
