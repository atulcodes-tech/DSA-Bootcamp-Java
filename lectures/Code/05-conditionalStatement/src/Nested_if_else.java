public class Nested_if_else {

    public static void main(String[] args) {
//        Nested if else


//        if(condition1){
//            if(condition2){
//                //code
//            }
//            else {
//                //code
//            }
//        }
//        else {
//            //code
//        }


//        1. Marks + attendance

//        int marks = 25;
//
//        int attendance = 80;
//
//
//        if(attendance >= 75){
//
//            if(marks >= 40){
//                System.out.println("You are pass...");
//            }
//            else {
//                System.out.println("failed due to low marks.");
//            }
//        }
//        else {
//            System.out.println("Failed due to low attendance...");
//        }



//        2. Login System

        String username = "admin";

        String password  = "1234";

        if(username.equals("adminn")){

            if(password.equals("1234")){
                System.out.println("Login Successful...");
            }
            else {
                System.out.println("Wrong Password...");
            }
        }
        else {
            System.out.println("Invalid Username...");
        }
    }
}
