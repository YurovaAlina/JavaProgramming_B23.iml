package day08_ifStatesment;

public class PracticeWithGroup {

    public static void main(String[] args) {
        int number = 0;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        if (positive) {
            System.out.println(number+" is positive number");
        }

        if (negative){
            System.out.println(number+ " is negative number");
        }

        if (zero){
            System.out.println("Number is a 0");
        }


        System.out.println("----------");

        String name = "John";
        int score = 59;
        boolean passed = score >= 60;
        boolean failed = score < 60;

        if (passed) {
            System.out.println("Congrats, you passed!");
        }
        if (failed) {
            System.out.println("better luck next time");
        }

        System.out.println("-------------");

        int number1 = 33;
        boolean odd = number1%2 != 0;
        boolean even = !odd;

        if (odd){
            System.out.println("Number " +number1 + " is even.");
    }
        if (even){
            System.out.println("Number " + number1 + " is odd");
        }

}
}
