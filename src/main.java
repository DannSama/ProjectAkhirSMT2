import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Account acc = new Account("Zahwa" , "1111" , 100000);
        String NamaBarang;
        Scanner tokoABC = new Scanner(System.in);
        boolean menu = true;
        boolean bl = true;
        Customer bg = new Customer();
        ShoppingCart SC = new ShoppingCart();

        DebitCart dc = new DebitCart();
        System.out.println("SELAMAT DATANG ");

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


        while (menu) {
            System.out.println("-------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t M E N U \t\t\t\t\t\t");
            System.out.println("-------------------------------------");
            System.out.println(" 1. Login");
            System.out.println(" 2. Register");
            System.out.println(" 3. Cek Saldo Kredit ");
            System.out.println(" 99.Logout ");
            int pilih = tokoABC.nextInt();

            if (pilih == 1) {
                System.out.println("\t\t\t\t\t\t\t LOGIN MENU \t\t\t\t\t\t\t\t");
                acc.loginChek();
                menu = false;
                bg.onlineShop();
            }
            if (pilih == 2) {
                System.out.println("\t\t\t\t\t\t REGISTER MENU \t\t\t\t\t\t");
                System.out.println("Nama : " );
                bg.nama = tokoABC.next();
                System.out.println("Umur :" );
                bg.age = tokoABC.next();
                System.out.println("Email :" );
                bg.Email = tokoABC.next();
                System.out.println("Username : ");
                acc.setUsername(tokoABC.next());
                System.out.println("Password :");
                acc.setPassword(tokoABC.next());
                System.out.println("REGISTRASI ANDA BERHASIL");
            }
            if (pilih == 3) {
                System.out.println("Sisa Saldo Kredit Anda : " + dc.getBalance());
            }
            if (pilih == 4) {
                System.exit(0);
            }
        }
        while (bl) {
            System.out.println("|\t\t\t\tNama Barangt\t\t\t|" + "\t\t\t\t(Rp)Harga Barang\t\t\t\t" + "|\t\t\tStok Barang\t\t\t\t");
            System.out.println("|1   | " + p1.getName() + " \t\t\t\t\t\t| " + p1.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p1.getStock() + " \t\t| ");
            System.out.println("|2   | " + p2.getName() + " \t\t\t\t\t\t\t| " + p2.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p2.getStock() + " \t\t| ");
            System.out.println("|3   | " + p3.getName() + " \t\t\t\t\t\t\t| " + p3.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p3.getStock() + " \t\t| ");
            System.out.println("|4   | " + p4.getName() + " \t\t\t\t\t\t| " + p4.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p4.getStock() + " \t\t| ");
            System.out.println("|5   | " + p5.getName() + " \t\t\t\t\t\t| " + p5.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p5.getStock() + " \t\t| ");
            System.out.println("|6   | " + p6.getName() + " \t\t\t\t\t| " + p6.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p6.getStock() + " \t\t| ");
            System.out.println("|7   | " + p7.getName() + " \t\t\t\t| " + p7.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p7.getStock() + " \t\t| ");
            System.out.println("|8   | " + p8.getName() + " \t\t\t\t\t\t\t| " + p8.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p8.getStock() + " \t\t| ");
            System.out.println("|9   | " + p9.getName() + " \t\t\t\t\t\t| " + p9.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p9.getStock() + " \t\t| ");
            System.out.println("|10  | " + p10.getName() + " \t\t\t\t\t\t\t| " + p10.getPrice() + " \t\t\t\t\t\t\t\t\t\t\t\t| " + p10.getStock() + " \t\t| ");
            System.out.println();
            System.out.println("99. Tampilkan Barang Belanja");
            System.out.println("0. Kembali Ke Menu Awal ");
            System.out.print("pilih :");
            int pilih = tokoABC.nextInt();


            if (pilih == 0) {
                bl = false;
                System.out.println("Apakah Anda ingin kembali ke menu awal ?");
                System.out.println("1. Ya");
                System.out.println("2. No");
                int pilihan = tokoABC.nextInt();
                if (pilihan == 1) {
                    bg.onlineShop();
                    if (pilihan == 2) {
                        bl = true;
                    }
                }
                    if (pilih == 1) {
                        bg.addToCard(p1);
                        bg.showFromcaert();
                        p1.setStock(p1.getStock() - 1);
                    }
                    if (pilih == 2) {
                        bg.addToCard(p2);
                        bg.showFromcaert();
                        p2.setStock(p2.getStock() - 1);
                    }
                    if (pilih == 3) {
                        bg.addToCard(p3);
                        bg.showFromcaert();
                        p3.setStock(p3.getStock() - 1);
                    }
                    if (pilih == 4) {
                        bg.addToCard(p4);
                        bg.showFromcaert();
                        p4.setStock(p4.getStock() - 1);
                    }
                    if (pilih == 5) {
                        bg.addToCard(p5);
                        bg.showFromcaert();
                        p5.setStock(p5.getStock() - 1);
                    }
                    if (pilih == 6) {
                        bg.addToCard(p6);
                        bg.showFromcaert();
                        p6.setStock(p6.getStock() - 1);
                    }
                    if (pilih == 7) {
                        bg.addToCard(p7);
                        bg.showFromcaert();
                        p7.setStock(p7.getStock() - 1);
                    }
                    if (pilih == 8) {
                        bg.addToCard(p8);
                        bg.showFromcaert();
                        p8.setStock(p8.getStock() - 1);
                    }
                    if (pilih == 9) {
                        bg.addToCard(p9);
                        bg.showFromcaert();
                        p9.setStock(p9.getStock() - 1);
                    }
                    if (pilih == 10) {
                        bg.addToCard(p10);
                        bg.showFromcaert();
                        p10.setStock(p1.getStock() - 1);
                    }
                    if (pilih == 99) {
                        bl = false;
                        bg.showFromcaert();

                        System.out.println();
                        System.out.println("0.Checkout");
                        System.out.print("Pilihan : ");
                        int cek = tokoABC.nextInt();
                        if (cek == 0) {
                            bg.CheckoutFromCart();
                            System.out.println("Tekan 1 untuk Melanjutkan");
                            System.out.print("Pilihan : ");
                            int cc = tokoABC.nextInt();
                            if (cc == 1) {
                                bl = true;
                            }
                        }
                    }
                }

                //    p[0] = bg;



                    ////searching di array



                }
            }
        }

