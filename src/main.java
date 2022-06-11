import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        boolean pro = true;
        Scanner why = new Scanner(System.in);
        Customer cs = new Customer(null, null, null);
        ShoppingCart sc = new ShoppingCart();
        Product p1 = new Product("Bakso", 20, 35000);
        Product p2 = new Product("Sosis", 10, 25000);
        Product p3 = new Product("Nuget", 7, 9500);
        Product p4 = new Product("Bakso Sapi", 19, 13750);
        Product p5 = new Product("Bakso Ikan", 40, 20000);
        Product p6 = new Product("Bakso Sapi", 5, 9000);
        Product p7 = new Product("Bandeng Presto", 24, 12000);
        Product p8 = new Product("Bandeng ORI", 6, 15000);
        Product p9 = new Product("Kebab isi 6", 27, 27000);
        Product p10 = new Product("Kebab isi 10", 18, 22500);
        Product p11 = new Product("Basreng", 33, 10000);
        Product p12 = new Product("Cireng", 20, 15000);
        Product p13 = new Product("Bakso Cireng", 66, 25000);


        while (pro) {
            cs.onlineShop();
            System.out.println("|No | " + "Nama Barang \t\t\t\t\t| " + "Harga (Rp) \t\t\t| " + "Stok Barang \t| ");
            System.out.println("|1  | " + p1.getNama() + " \t\t\t\t\t\t| " + p1.getprice() + " \t\t\t| " + p1.getStok() + " \t\t| ");
            System.out.println("|2  | " + p2.getNama() + " \t\t\t\t\t\t| " + p2.getprice() + " \t\t\t| " + p2.getStok() + " \t\t| ");
            System.out.println("|3  | " + p3.getNama() + " \t\t\t\t\t\t| " + p3.getprice() + " \t\t\t| " + p3.getStok() + " \t\t| ");
            System.out.println("|4  | " + p4.getNama() + " \t\t\t\t\t| " + p4.getprice() + "\t\t\t| " + p4.getStok() + " \t\t| ");
            System.out.println("|5  | " + p5.getNama() + "\t\t\t\t\t| " + p5.getprice() + "\t\t\t| " + p5.getStok() + " \t\t| ");
            System.out.println("|6  | " + p6.getNama() + "\t\t\t\t\t| " + p6.getprice() + "\t\t\t| " + p6.getStok() + " \t\t| ");
            System.out.println("|7  | " + p7.getNama() + " \t\t\t\t| " + p7.getprice() + " \t\t\t| " + p7.getStok() + " \t\t| ");
            System.out.println("|8  | " + p8.getNama() + " \t\t\t\t\t| " + p8.getprice() + " \t\t\t| " + p8.getStok() + " \t\t| ");
            System.out.println("|9  | " + p9.getNama() + " \t\t\t\t\t| " + p9.getprice() + " \t\t\t| " + p9.getStok() + " \t\t| ");
            System.out.println("|10 | " + p10.getNama() + " \t\t\t\t\t| " + p10.getprice() + " \t\t\t| " + p10.getStok() + " \t\t| ");
            System.out.println("|11 | " + p11.getNama() + "\t\t\t\t\t\t| " + p11.getprice() + " \t\t\t| " + p11.getStok() + " \t\t| ");
            System.out.println("|12 | " + p12.getNama() + " \t\t\t\t\t\t| " + p12.getprice() + " \t\t\t| " + p12.getStok() + " \t\t| ");
            System.out.println("|13 | " + p13.getNama() + " \t\t\t\t\t| " + p13.getprice() + " \t\t\t| " + p13.getStok() + " \t\t| ");
            System.out.println();
            System.out.println("99.Tampilkan Keranjang Belanja");
            System.out.println("0.Kembali Ke Menu Sebelumnya");
            System.out.print("Pilihan : ");
            int pilih = why.nextInt();

            if (pilih == 0) {
                pro = false;
                System.out.println("Apakah anda ingin Kembali Ke menu Sebelumnya?");
                System.out.println("1.Ya");
                System.out.println("2.Tidak");
                int pilihan = why.nextInt();
                if (pilihan == 1) {
                    cs.onlineShop();
                }
                if (pilihan == 2) {
                    pro = true;
                }
            }
            if (pilih == 1) {
                cs.addToCart(p1);
                p1.setStok(p1.getStok() - 1);
            }
            if (pilih == 2) {
                cs.addToCart(p2);
                p2.setStok(p2.getStok() - 1);
            }
            if (pilih == 3) {
                cs.addToCart(p3);
                p3.setStok(p3.getStok() - 1);
            }
            if (pilih == 4) {
                cs.addToCart(p4);
                p4.setStok(p4.getStok() - 1);
            }
            if (pilih == 5) {
                cs.addToCart(p5);
                p5.setStok(p5.getStok() - 1);
            }
            if (pilih == 6) {
                cs.addToCart(p6);
                p6.setStok(p6.getStok() - 1);
            }
            if (pilih == 7) {
                cs.addToCart(p7);
                p7.setStok(p7.getStok() - 1);
            }
            if (pilih == 8) {
                cs.addToCart(p8);
                p8.setStok(p8.getStok() - 1);
            }
            if (pilih == 9) {
                cs.addToCart(p9);
                p9.setStok(p9.getStok() - 1);
            }
            if (pilih == 10) {
                cs.addToCart(p10);
                p10.setStok(p10.getStok() - 1);
            }
            if (pilih == 11) {
                cs.addToCart(p11);
                p11.setStok(p11.getStok() - 1);
            }
            if (pilih == 12) {
                cs.addToCart(p12);
                p12.setStok(p12.getStok() - 1);
            }
            if (pilih == 13) {
                cs.addToCart(p13);
                p13.setStok(p13.getStok() - 1);
            }
            if (pilih == 99) {
                cs.showFromCart();
                pro = false;
                System.out.println();
                System.out.println("0.Checkout");
                System.out.print("Pilihan : ");
                int cek = why.nextInt();
                if (cek == 0) {
                    cs.checkOutFromCart();
                    System.out.println("-1. keluar");
                    System.out.println("1. lanjut belanja");
                    System.out.print("Pilihan : ");
                    int cc = why.nextInt();
                    if (cc == -1) {
                        System.exit(0);
                    }
                    else if (cc == 1){
                        pro = true;
                    }
                }
            }

        }

    }
}

