public class PracticeWithGroup {

    public static void main(String[] args) {
        int score = 90;
        boolean A = score >= 90 && score <=100;
        boolean B = score >= 80 && score <=90;
        boolean C = score >= 70 && score <=80;
        boolean D = score >= 60 &&score <=70;
        boolean F = score < 60 && score >=0;
       // boolean invalid = !A || !B || !C || !D || !F;


        if (A){
            System.out.println("You got an A");

        }
        if (B){
            System.out.println("You got a B");
        }
        if (C){
            System.out.println("You got a C");
        }
        if (D){
            System.out.println("You got a D");
        }
        if (F){
            System.out.println("You got a F");
        }
       // if (invalid){
          //  System.out.println("Impossible");
      //  }
}
}
