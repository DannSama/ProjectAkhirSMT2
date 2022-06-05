public class Account {
    protected String Username ;
    protected String password ;
    protected double balance ;

    public Account(String username, String password, double balance){
        this.Username =username;
        this.password = password;
        this.balance = balance;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
}
