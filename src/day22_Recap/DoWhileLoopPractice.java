package day22_Recap;
import java.util.Scanner;
public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int i= 0;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10); //i: 0,1,2,..10

        System.out.println("---------");
        Scanner scan = new Scanner (System.in);
        String username = "JohnJames";
        String password = "John123";
        String u = "";
        String p = "";

        do{
            System.out.println("Enter your username:");
            u = scan.next();

            System.out.println("Enter your username:");
            p = scan.next();
        }while( !(u.equals(username) && p.equals(password)) );
        System.out.println("Logged in");
    }



}
