package day19_Loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i = 0; i<=1000; i++){ //i: 0,1,2,3,4,....1000
            System.out.println(i+ " ");
        }
        System.out.println(); // to make sure next print statement from new line
        System.out.println("Hello");

        for(int i=1; i <=100; i++){
            if(i%2 !=0){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
        System.out.println("------------");
        for(int i= 1; i <= 100; i+=2){
            System.out.println(i+" ");
        }
    }




}
