class Transaction {
    public void process(double amount) {
        System.out.println("Processing transaction of amount: " + amount);
    }

    public void process(String transactionType, double amount) {
        System.out.println("Processing " + transactionType + " transaction of amount: " + amount);
    }

    public void process() {
        System.out.println("Processing general transaction.");
    }
}

class Withdrawal extends Transaction {
    @Override
    public void process() {
        System.out.println("Processing withdrawal transaction.");
    }
}

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.process(500.0);
        transaction.process("Deposit", 1000.0);

        // Call overridden method in subclass
        Transaction withdrawal = new Withdrawal();
        withdrawal.process();
    }
}
