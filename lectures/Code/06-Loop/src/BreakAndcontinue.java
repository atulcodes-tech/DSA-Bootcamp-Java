public class BreakAndcontinue {

    public static void main(String[] args) {

        //break loop ko turant stop kar deta hai
        // continue current skip next

        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }

    }
}
