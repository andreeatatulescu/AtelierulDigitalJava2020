package challenge2;

public class BankAccount {
    private double debit;
    private String name;

    public BankAccount(double debit, String name) {
        this.debit = debit;
        this.name = name;
    }

    public void withDraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if(debit >= amount) {
            this.debit -= amount;
            System.out.println("New amount after withDraw: " + debit);
        } else {
            throw new InsufficientFundsException();
        }
    }

    public void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
        System.out.println("New amount after deposit: " + debit);
    }

    private void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
