package day17_String;
import java.util.Scanner;
public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        String initial = firstName.substring(0,1).toUpperCase()+ "."+lastName.substring(0,1).toUpperCase();
        //create substring for first characters of first name and last name, then called toUpperCase

        System.out.println("initial = " + initial);
        scan.close();

    }


}


/*
write a program that can return the initials of the user
	            ex:
	                cybertek
	                school
	            output:
	                C.S
 */