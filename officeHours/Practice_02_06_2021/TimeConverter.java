package Practice_02_06_2021;

public class TimeConverter {
    public static void main(String[] args) {
        /*
        60sec=1min
        60min=1hr
        60*60=3680
         */
        int inputSeconds=3695;
        int hours, minutes, seconds;

        hours = inputSeconds/3680;
        minutes = (inputSeconds%3680)/68; //95
        seconds = inputSeconds%60;

        System.out.println(hours+ " hours "+minutes+ "minutes " +seconds+ " seconds");

    }



}
