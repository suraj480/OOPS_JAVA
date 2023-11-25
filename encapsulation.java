import bank.Account;

public class encapsulation {
    public static void main(String args[]) {
        Account account1 = new Account();
        String result = account1.name = "suraj";
        System.out.println(result);
    }
}
