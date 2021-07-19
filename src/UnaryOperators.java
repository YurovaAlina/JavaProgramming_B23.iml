public class UnaryOperators {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = n1++;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int r = 200;

        System.out.println(r++); //200. delay
        System.out.println("r = " + r); //201. right away

        int p = 200;

        System.out.println( ++p);
        System.out.println("p = " + p);

        int y = 100;
        int result = y++ +1;

        System.out.println("result = " + result);
        System.out.println("y = " + y);



    }




}
