import java.util.Scanner;
public class Admin {
    Scanner why = new Scanner(System.in);
    private BarangIn[] barangIn;
    private String nama;
    private String toko;
    private String email;
    private Account acc;
    private BarangOut sc;
    private main m;
    int pilih;
    private boolean menu = true;

    public Admin(String nama, String toko, String email) {
        this.nama = nama;
        this.toko = toko;
        this.email = email;
        acc = new Account("admin", "min1", 0);
        sc = new BarangOut();
        barangIn = new BarangIn[20];
        m = new main();
    }

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public void addToCart(BarangIn barangIn) {
        sc.addToCartProcess(barangIn);
    }

    public void showFromCart() {
        sc.displayAllProduct();
    }

    public void checkOutFromCart() {
        double total = sc.calculateTotal();
        System.out.println("total : "+ total);
        System.out.print("uang : ");
        double mon = why.nextDouble();
        double change;
        //sc.resetShoppingCart();
        change = mon - total;
        System.out.println("kembalian : "+change);
        System.out.println("purchase success");
        acc.setBalance(total);
    }

    public boolean loginCheck() {
        System.out.print("Input Username : ");
        String username = why.next();
        System.out.print("Input Password : ");
        String password = why.next();
        if (username.equalsIgnoreCase(acc.getUsername()) && password.equalsIgnoreCase(acc.getPassword())) {
            System.out.println("Login Berhasil");
            onlineShop();
            return true;
        }
        else {
            System.out.println("Username atau Password Salah");
            return false;
        }
    }

    public void hello() {
        while (menu) {
            System.out.println("----------------------------------------");
            System.out.println("|\t\t\t\tMENU\t\t\t\t|");
            System.out.println("---------------------------------------");
            System.out.println("|1.Login                               |");
            System.out.println("|2.Register                            |");
            System.out.println("|99.end program                             |");
            int pilih = why.nextInt();

            if (pilih == 1) {
                System.out.println("------------LOGIN MENU---------------");
                loginCheck();

            }
            if (pilih == 2) {
                System.out.println("------------REGISTER MENU-----------");
                System.out.print("Nama : ");
                this.nama = why.next();
                System.out.print("Toko : ");
                this.toko = why.next();
                System.out.print("Email : ");
                this.email = why.next();
                System.out.print("Username : ");
                acc.setUsername(why.next());
                System.out.print("Password : ");
                acc.setPassword(why.next());
                System.out.println("Data Berhasil dibuat");
            }
            if (pilih == 99) {
                System.exit(0);
            }
        }
    }
    public void onlineShop() {
        while (menu) {
            System.out.println("|________________TOKO MUTIARA INDAH______________|");
            System.out.println("|1.Mulai Belanja                                       |");
            System.out.println("|2.check stock                                         |");
            System.out.println("|3.check income                                        |");
            System.out.println("|4.tambah barang                                       |");
            System.out.println("|5.riwayat penjualan                                   |");
            System.out.println("|99.LOGOUT                                             |");
            int pilih = why.nextInt();

            if (pilih == 1) {
                menu = false;

            }
            else if (pilih == 2){

            }
            else if (pilih == 3){
                System.out.println("income penjualan : " + acc.getBalance());
            }
            else if (pilih == 4){
                int i = 0;
                    barangIn[i] = new BarangIn();
                    System.out.println("masukan nama, harga dan jumlah barang");
                    barangIn[i].addBarang(why.next(), why.nextDouble(), why.nextInt());
                    System.out.println("barang telah di tambahkan");
                    System.out.println("tambah barang lagi?");
                    System.out.println("y/n");
                    String pill = why.next();
                    if (pill.equalsIgnoreCase("n")){
                        menu = true;
                        onlineShop();
                    }
                    else if (pill.equalsIgnoreCase("y")){
                        menu = false;
                        return;
                    }
            }
            else if (pilih == 5){
                sc.info();
                menu = true;
            }
            else if (pilih == 99) {
                hello();
            }
        }
    }
}