package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {
        char grade = 'C';
        /*
        pass A, B,C,D
        failed F
         */
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");

            case 'F':
                System.out.println("Failed");

            default:
                System.out.println("Invalid Grade");


        }
    }



}
