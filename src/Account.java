import java.util.Scanner;
public class Account {
    Scanner scn = new Scanner(System.in);
    protected String username ;
    protected String password ;
    protected double balance ;

    public Account(String username, String password, double balance){
        this.username =username;
        this.password = password;
        this.balance = balance;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
    public boolean loginChek() {
        System.out.println("Input Username :");
        String user = scn.next();
        System.out.println("Input Password :");
        String pass = scn.next();
        if (getUsername().equalsIgnoreCase(user) && getPassword().equalsIgnoreCase(pass)) {
            System.out.println("Login Berhasil :");
            return true;
        } else {
            System.out.println("Username Atau Password Salah !!!");
        }
        return false;
    }
}
