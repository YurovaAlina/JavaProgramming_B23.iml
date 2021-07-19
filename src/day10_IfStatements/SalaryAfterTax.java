package day10_IfStatements;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 100_000; //writting double cause at the result we will get decimal
        double taxRate = 0;
        
        if(salary >= 130000){ 
            taxRate = 0.35;
        }else if(salary >= 100000){//не нужно писать && < потому что это неправда и джава распознает ее по умолячанию
            taxRate = 0.30;            
        }else if(salary >= 80000){ // также и здесь..by default
            taxRate = 0.25; 
        }else {
            taxRate = 0.20;
        }
        boolean isMarried = true;
        if (isMarried){
            taxRate -= 0.05;
            
        }
        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("Salary After Tax = " + salaryAfterTax);
        // нужно добавить дополнительное условие - если женат, платит на 5 процентов меньше
        // добавляем булин потому что результат может быть только правда или ложь, никаких else больше нет
        
    }
    
    
    
    
}
