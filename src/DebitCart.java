public class DebitCart extends Barang {
    protected double balance ;

    public void DebitCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    void info() {

    }
}
