package challenge2;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.out.println("Not enough money in your account!");
    }
}
