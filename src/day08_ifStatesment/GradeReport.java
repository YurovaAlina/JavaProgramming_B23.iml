package day08_ifStatesment;

public class GradeReport {

    public static void main(String[] args) {


        int score = 85;
        if (score >= 90 && score <= 100) { //90,91,92...100
            System.out.println("Excellent, You made an A");
        }
        if (score >= 80 && score <= 89) { // 80,81,82...89
            System.out.println("Good job, you made B");

        }
        if (score >= 70 && score <= 79) {
            System.out.println("Good, you made C");
        }

        if (score >= 60 && score <= 69) {
            System.out.println("You made a D");
        }


    }
}


/*
score
grade
A: 90 <==score <= 100
B: 80 <==score <= 89
C: 70 <==score <= 79
D: 60 <==score <= 69
F: score < 100
 */