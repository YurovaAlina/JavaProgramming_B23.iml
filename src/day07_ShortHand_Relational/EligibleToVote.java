package day07_ShortHand_Relational;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Conor McGregor";
                int age = 35;
                String citizen = "Ireland";

                boolean eligibleToVote = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote for Biden: " +eligibleToVote);


    }
}
