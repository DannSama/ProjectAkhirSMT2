import java.util.Scanner;
public class Customer extends Barang {
    Scanner scn = new Scanner(System.in);
    protected String nama;
    protected String age;
    protected String Email;
    protected Account Account;
    protected ShoppingCart SC;
    protected DebitCart DebitCart;

    int pilih;
    protected boolean menu = true;

    public void Customer(String nama, String age, String email) {
        this.nama = nama;
        this.age = age;
        this.Email = email;
        Account = new Account("Zahwa", "123", 1000000);
        SC = new ShoppingCart();
        DebitCart = new DebitCart();
    }

    public void ShowProfile() {
        System.out.println("Nama     :" + nama);
        System.out.println("Umur     :" + age);
        System.out.println("Username :" + Email);
        System.out.println("Password :" + Account.getPassword());
        System.out.println("Balance  :" + Account.balance);
    }

    public void addToCard(Product product) {
        SC.addToCartProcess(product);
    }

    public void showFromcaert() {
        SC.displayAllProduct();
    }

    public void CheckoutFromCart() {
        double total = SC.calculateTotal();
        if (total <= Account.getBalance() - total) ;
        SC.resetShopingCart();
    }

    public boolean loginChek(String Username, String password) {
        System.out.println("Input Username :");
        Username = scn.next();
        System.out.println("Input Password :");
        password = scn.next();
        if (Account.getUsername().equalsIgnoreCase(Username) && Account.getPassword().equalsIgnoreCase(password)) {
            System.out.println("Login Berhasil :");
            ShowProfile();
            onlineShop();
        } else {
            System.out.println("Username Atau Password Salah !!!");
        }
        return false;
    }


    public void topUpBalance(DebitCart D, double jumlah) {
        DebitCart = D;
        System.out.println("Input jumlah :");
        jumlah = scn.nextDouble();
        Account.setBalance(Account.balance + jumlah);
    }

    public void jual(int jumlah) {
        stok = stok - jumlah;
    }

    public void addSupply(int jumlah) {
        stok = stok + jumlah;
    }

    @Override
    void info() {
        System.out.println("Stok :" + stok);
    }

    public void hallo() {
        while (menu) {
            System.out.println("-------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t M E N U \t\t\t\t\t\t");
            System.out.println("-------------------------------------");
            System.out.println(" 1. Login");
            System.out.println(" 2. Register");
            System.out.println(" 3. Cek Saldo Kredit ");
            System.out.println(" 99.Logout ");
            int pilih = scn.nextInt();

            if (pilih == 1) {
                System.out.println("\t\t\t\t\t\t\t LOGIN MENU \t\t\t\t\t\t\t\t");
                loginChek(null, null);
            }
            if (pilih == 2) {
                System.out.println("\t\t\t\t\t\t REGISTER MENU \t\t\t\t\t\t");
                System.out.println("Nama : " + nama);
                this.nama = scn.next();
                System.out.println("Umur :" + age);
                this.age = scn.next();
                System.out.println("Email :" + Email);
                this.Email = scn.next();
                System.out.println("Username : ");
                Account.setUsername(scn.next());
                System.out.println("Password :");
                Account.setPassword(scn.next());
                System.out.println("REGISTRASI ANDA BERHASIL");
                ShowProfile();
            }
            if (pilih == 3) {
                System.out.println("Sisa Saldo Kredit Anda : " + DebitCart.getBalance());
            }
            if (pilih == 4) {
                System.exit(0);
            }
        }
    }

    public void onlineShop() {
        while (menu) {
            System.out.println("WELCOME TO TOKO ABC ");
            System.out.println("1. Mulai Belanja ");
            System.out.println("2. Top Up OVO");
            System.out.println("3. Informasi Akun");
            System.out.println("4. Info stok Barang ");
            System.out.println("99. Kembali ke menu login");
            int pilihan = scn.nextInt();

            if (pilihan == 1) {
                menu = false;
            }
            if (pilihan == 2) {
                topUpBalance(DebitCart, 0);
                System.out.println("Saldo Anda berhasil ");
            }
            if (pilihan == 3) {
                ShowProfile();
            }
            if (pilihan == 4) {
                stok(scn.nextInt());
            }
            if (pilihan == 99) {
                hallo();
            }
        }
    }

    private void stok(int nextInt) {
    }


}