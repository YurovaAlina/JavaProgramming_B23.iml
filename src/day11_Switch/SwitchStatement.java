package day11_Switch;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 20;
        String str = "";
        switch (num){
            case 0:
                str = "c#";
                break;
            case 10:
                str += "is ";

            case 15:
                str = "fun";
            case 20:
                str +="java";
            case 25:
                str += " is";
                break;

            case 30:
                str+="fun";
                break;
            case 35:
                str = "python";
            case 40:
                str +="90";


        }
        System.out.println(str);
    }


}
