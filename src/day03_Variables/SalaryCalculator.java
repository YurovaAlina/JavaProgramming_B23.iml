package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 60;
        int weeklyHours = 50;

        int salary = hourlyRate * weeklyHours * 48;

        System.out.println(salary);

        double taxRate = 0.32;
        double totalTax = salary * taxRate;
        double salaryAfterTax= salary - totalTax;

        System.out.println(salaryAfterTax);
    }





}
