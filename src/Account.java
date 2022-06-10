import java.util.Scanner;
public class Account {
    Scanner scn = new Scanner(System.in);
    private String username ;
    private String password ;
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
        System.out.print("Input Username : ");
        String user = scn.next();
        System.out.print("Input Password : ");
        String pass = scn.next();
        if (user.equalsIgnoreCase(getUsername())&&pass.equalsIgnoreCase(getPassword())) {
            System.out.println("Login Berhasil :");
            return true;
        } else {
            System.out.println("Username Atau Password Salah");
        }
        return false;
    }
}
