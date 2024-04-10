public class Elevy {
    private String customer;
    private int transID;
    private double balance;
    private double transfer;

    public Elevy(String customer, double balance, int transID) {
        this.customer = customer;
        this.balance = balance;
        this.transID = transID;
    }

    public void serviceTax() {
        if (transfer >= 1 && transfer <= 1000) {
            double tax = Math.min(10, transfer * 0.01);
            System.out.println("Service tax: GHc " + tax);
        }
    }

    public void eLevy() {
        if (transfer > 100) {
            double levy = transfer * 0.015;
            System.out.println("E-levy: GHc " + levy);
        }
    }

    public void performTransaction(double transferAmount) {
        if (balance >= transferAmount) {
            transfer = transferAmount;
            balance -= transferAmount;
            System.out.println("Customer: " + customer);
            System.out.println("Original balance: GHc " + (balance + transferAmount));
            System.out.println("New balance: GHc " + balance);
            serviceTax();
            eLevy();
            System.out.println("Transaction ID: " + transID);
        } else {
            System.out.println("You do not have enough balance");
        }
    }


}
