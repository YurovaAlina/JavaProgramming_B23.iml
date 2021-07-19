package day17_String;
import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your account number:");
        String account = scan.next();
        if (account.length() == 7 || account.length() == 10){
            if(account.charAt(0) == '2' && account.length() == 7){
                System.out.println("Valid account");
            }else if(account.charAt(0)== '5'&& account.length() == 10){
                System.out.println("Valid account");
            }
        }else{
            System.out.println("Invalid account");

            scan.close();

        }
    }





}
/*
можно делать через свитч стейтмент
char sirstChar = account.charAt(0);
switch (firstChar){
case '2': если первая цифра аккаунта 2
if(account.length() == 7){
sout (Valid account)
}else{ if length is not 7
sout (invalid account. it should be 7 character long);
}
break
case '5': the first character of account is 5
if (account.length() == 10){
result - valid;
}else{
result = invalid (it should be 10 character long)
}
break

default:
sout (result)
 */