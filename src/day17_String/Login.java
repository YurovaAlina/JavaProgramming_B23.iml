package day17_String;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        String correctUsername = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();
        // username and password should match

        boolean canLogIn = username.equalsIgnoreCase(correctUsername) && password.equals(correctPassword);
        if(canLogIn){
            System.out.println("Logged in succesfully");
        }else{
            System.out.println("Invalid username or password");
        }
    }



}
