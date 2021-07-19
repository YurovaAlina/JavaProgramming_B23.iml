package day06_UnaryOperators;

public class PostPrePractice {
    public static void main(String[] args) {
        int a = 1; //a=1
        a = -a-- + a++ / -a-- *--a; // a=1-1=0+1=1-1=0-1=-1

        int y= 50; //y= 50+1=51-1=50+1=51-1=50
        int z= -y++ + --y - ++y + y--;

        // z= -50 + 50 - 51 + 51
        // z=0 - 51+51
        // z= -51+51
        // z=o

    }





}
