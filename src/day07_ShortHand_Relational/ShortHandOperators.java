package day07_ShortHand_Relational;

public class ShortHandOperators {
    public static void main(String[] args) {

        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2; //name 3 = "Mehmet"

        name2 = name1; // name2 now is Muhtar, and Mehmet is lost
        name1 = name2; //name1 is still Muhtar
        name1 = name3;
        //чтобы Мехмет не потерялся, нужно создать третий стринг, 1 variable is only one data

       int balance = 300;
      // balance = balance + 200;
        balance+= 200;

        balance+= 1000; 

        System.out.println("balance = " + balance);
        
        String school = "Cybertek";
        school += "School";
        System.out.println("school = " + school);
        
        double salary = 100000;

        salary = salary * 0.65; //or
        salary *= 0.65;
        System.out.println("salary = " + salary);

        double slices = 10;
        slices /= 3;

        System.out.println("slices = " + slices);


    }





}
