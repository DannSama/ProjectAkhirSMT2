import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String NamaBarang;
        Scanner tokoABC = new Scanner(System.in);
        NamaBarang = tokoABC.nextLine();
        boolean bl = true;
        Customer cs = new Customer(null, null, null);
        ShoppingCart SC = new ShoppingCart();

        System.out.println("SELAMAT DATANG ");
        Barang[] b = new Barang[100];
        Customer bg = new Customer("zahwa", "19", "zahwa15@gmail.com");
        bg = new Customer("Athaya", "18", "Athayaabdanhanif@gmail.com");

        Product p1 = new Product("Bakso sosis", 20, 35000);
        Product p2 = new Product("Sosis", 10, 20000);
        Product p3 = new Product("Nuget", 5, 30000);
        Product p4 = new Product("Bakso Sapi", 7, 15000);
        Product p5 = new Product("Bakso Ikan", 9, 20000);
        Product p6 = new Product("Bandeng Presto", 6, 35000);
        Product p7 = new Product("Udang Bumbu Balado", 20, 40000);
        Product p8 = new Product("Kebab", 10, 15000);
        Product p9 = new Product("Roti Mariam", 9, 30000);
        Product p10 = new Product("Sambosa", 5, 40000);

        while (bl) {
            System.out.println("\t\t\t |\t\t\t\tNama Barangt\t\t\t\t|" + "\t\t\t\t(Rp)Harga Barang\t\t\t\t" + "\t\t\t\tStok Barang\t\t\t\t");
            System.out.println("|1   | " + p1.getNama() + " \t\t\t\t\t\t| " + p1.getPrice() + " \t\t\t| " + p1.getStok() + " \t\t| ");
            System.out.println("|2   | " + p2.getNama() + " \t\t\t\t\t\t| " + p2.getPrice() + " \t\t\t| " + p2.getStok() + " \t\t| ");
            System.out.println("|3   | " + p3.getNama() + " \t\t\t\t\t\t| " + p3.getPrice() + " \t\t\t| " + p3.getStok() + " \t\t| ");
            System.out.println("|4   | " + p4.getNama() + " \t\t\t\t\t\t| " + p4.getPrice() + " \t\t\t| " + p4.getStok() + " \t\t| ");
            System.out.println("|5   | " + p5.getNama() + " \t\t\t\t\t\t| " + p5.getPrice() + " \t\t\t| " + p5.getStok() + " \t\t| ");
            System.out.println("|6   | " + p6.getNama() + " \t\t\t\t\t\t| " + p6.getPrice() + " \t\t\t| " + p6.getStok() + " \t\t| ");
            System.out.println("|7   | " + p7.getNama() + " \t\t\t\t\t\t| " + p7.getPrice() + " \t\t\t| " + p7.getStok() + " \t\t| ");
            System.out.println("|8   | " + p8.getNama() + " \t\t\t\t\t\t| " + p8.getPrice() + " \t\t\t| " + p8.getStok() + " \t\t| ");
            System.out.println("|9   | " + p9.getNama() + " \t\t\t\t\t\t| " + p9.getPrice() + " \t\t\t| " + p9.getStok() + " \t\t| ");
            System.out.println("|10  | " + p10.getNama() + " \t\t\t\t\t\t| " + p10.getPrice() + " \t\t\t| " + p10.getStok() + " \t\t| ");
            System.out.println();
            System.out.println("99. Tampilkan Barang Belanja");
            System.out.println("0. Kembali Ke Menu Awal ");
            System.out.println("pilih :");
            int pilih = tokoABC.nextInt();


            if (pilih == 0) {
                bl = false;
                System.out.println("Apakah Anda ingin kembali ke menu awal ?");
                System.out.println("1. Ya");
                System.out.println("2. No");
                int pilihan = tokoABC.nextInt();
                if (pilihan == 1) {
                    cs.onlineShop();
                    if (pilihan == 2) {
                        bl = true;
                    }
                    if (pilih == 1) {
                        cs.addToCard(p1);
                        p1.setStok(p1.getStok() - 1);
                    }
                    if (pilih == 2) {
                        cs.addToCard(p2);
                        p2.setStok(p2.getStok() - 1);
                    }
                    if (pilih == 3) {
                        cs.addToCard(p3);
                        p3.setStok(p3.getStok() - 1);
                    }
                    if (pilih == 4) {
                        cs.addToCard(p4);
                        p4.setStok(p4.getStok() - 1);
                    }
                    if (pilih == 5) {
                        cs.addToCard(p5);
                        p5.setStok(p5.getStok() - 1);
                    }
                    if (pilih == 6) {
                        cs.addToCard(p6);
                        p6.setStok(p6.getStok() - 1);
                    }
                    if (pilih == 7) {
                        cs.addToCard(p7);
                        p7.setStok(p7.getStok() - 1);
                    }
                    if (pilih == 8) {
                        cs.addToCard(p8);
                        p8.setStok(p8.getStok() - 1);
                    }
                    if (pilih == 9) {
                        cs.addToCard(p9);
                        p9.setStok(p9.getStok() - 1);
                    }
                    if (pilih == 10) {
                        cs.addToCard(p10);
                        p10.setStok(p1.getStok() - 1);
                    }
                    if (pilih == 99) {
                        cs.showFromcaert();
                        bl = false;
                        System.out.println();
                        System.out.println("0.Checkout");
                        System.out.print("Pilihan : ");
                        int cek = tokoABC.nextInt();
                        if (cek == 0) {
                            cs.CheckoutFromCart();
                            System.out.println("Tekan 1 untuk Melanjutkan");
                            System.out.print("Pilihan : ");
                            int cc = tokoABC.nextInt();
                            if (cc == 1) {
                                bl = true;
                            }
                        }
                    }


                    b[0] = bg;

                    bg.stok(100);
                    bg.info();

                    bg.jual(12);
                    bg.info();

                    bg.addSupply(4);
                    bg.info();

                    b[0].setStok(100);
                    b[0].info();


                    ////searching di array
                    for (int i = 0; i < b.length; i++) {
                        if (b[i].getNama().equals("Stok Barang")) {
                            bg.jual(1);
                        }

                    }


                }
            }
        }
    }
}

