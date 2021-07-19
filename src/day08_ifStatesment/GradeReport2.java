package day08_ifStatesment;
//второй способб первый в gradereport
public class GradeReport2 {
    public static void main(String[] args) {
        int score = 95;
        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >=80; // didnt make A and score is greater or equal to 80;
        boolean madeC = !madeA && !madeB && score >= 70; // didnt make A $ B and score is greater than 70;
        boolean madeD = !madeA && !madeB && !madeC && score >= 60; //didnt make A B C and score is greater than 60
        boolean madeF = !!madeA && !madeB && !madeC && !madeD;

        if(madeA){
            System.out.println("Excellent, you made an A");

        }
        if(madeB){
            System.out.println("Good job, you made a B");
        }

        if(madeC){
            System.out.println("You made C");
        }


    }





}
