import java.util.Scanner;
public class Customer extends Barang {
    Scanner scn = new Scanner(System.in);
    protected String nama;
    protected String age;
    protected String Email;
    protected Account acc;
    protected ShoppingCart SC;
    protected DebitCart DebitCart;

    int pilih;
    protected boolean menu = true;

    public void Customer(String nama, String age, String email) {
        this.nama = nama;
        this.age = age;
        this.Email = email;
        acc = new Account("zahwa","111",100000);
        SC = new ShoppingCart();
        DebitCart = new DebitCart();
    }

    public void ShowProfile() {
        System.out.println("Nama     :" + nama);
        System.out.println("Umur     :" + age);
        System.out.println("Username :" + acc.getUsername());
        System.out.println("Password :" + acc.getPassword());
        System.out.println("Balance  :" + acc.balance);
    }

    public void addToCard(Product product)
    {
        SC.addToCartProcess(product);
    }

    public void showFromcaert() {
        SC.displayAllProduct();
    }

    public void CheckoutFromCart() {
        double total = SC.calculateTotal();
        if (total <= acc.getBalance() - total) ;
        SC.resetShoppingCart();
    }


    public void topUpBalance(DebitCart D, double jumlah) {
        DebitCart = D;
        System.out.println("Input jumlah :");
        jumlah = scn.nextDouble();
        acc.setBalance(acc.balance + jumlah);
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

    void stok(int nextInt) {
    }


}