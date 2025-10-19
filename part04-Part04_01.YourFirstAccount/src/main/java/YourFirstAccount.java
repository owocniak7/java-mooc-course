
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account antekAccount = new Account("Antek's account", 100.00);
        
        antekAccount.deposit(20.0);
        System.out.println(antekAccount);
    }
}
