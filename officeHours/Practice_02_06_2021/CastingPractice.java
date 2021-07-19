package Practice_02_06_2021;

public class CastingPractice {
    public static void main(String[] args) {

        byte b= 10;
        short s = b; //implicit

        double a=5.3;
        int i = (int) a; //explicit

        System.out.println(i); //5
        a=i; //implicit a = 5

        long l = 999999999999l;
        int ii = (int)l;


    }



}
