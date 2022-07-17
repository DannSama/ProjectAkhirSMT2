import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        boolean pro = true;
        Scanner why = new Scanner(System.in);
        Admin admin = new Admin(null, null, null);
        BarangOut sc = new BarangOut();
        BarangIn[] In = new BarangIn[10];
        for (int i = 0; i < In.length; i++) {
            In[i] = new BarangIn();//[as]
        }
        In[0].addBarang("bakso      ", 25000, 10);
        In[1].addBarang("ayam       ", 25000, 10);
        In[2].addBarang("nasi goreng", 25000, 10);
        In[3].addBarang("ak47       ", 25000, 10);
        In[4].addBarang("mp4        ", 25000, 10);
        In[5].addBarang("momogi     ", 25000, 10);
        In[6].addBarang("panada     ", 25000, 10);
        In[7].addBarang("jalkot     ", 25000, 10);
        In[8].addBarang("boba       ", 25000, 10);
        In[9].addBarang("oli tmo    ", 25000, 10);

        admin.hello();
        while (pro) {
            System.out.println("|No | " + "Nama Barang \t\t\t\t\t| " + "Harga (Rp) \t\t\t| " + "Stok Barang \t| ");
            int huft =1;
            for (int i = 0; i < In.length; i++) {
                System.out.println("| " + huft + " | " + In[i].getNama() + " \t\t\t\t\t| " + In[i].getprice() + " \t\t\t\t\t| " + In[i].getStok() + " \t\t| ");
                huft++;
            }
            System.out.println("99.Tampilkan Keranjang Belanja");
            System.out.println("90. rincian barang");
            System.out.println("0.Kembali Ke Menu Sebelumnya");
            System.out.print("Pilihan : ");
            int pilih = why.nextInt();

           if (pilih == 0) {
                pro = false;
                System.out.println("Apakah anda ingin Kembali Ke menu Sebelumnya?");
                System.out.println("1.tidak");
                System.out.println("2.ya");
                int pilihan = why.nextInt();
                if (pilihan == 1) {
                    pro = true;
                }
                else if (pilihan == 2) {
                    admin.setMenu(true);
                    admin.onlineShop();
                    pro = true;
                }
            }
           else if (pilih<=In.length) {
                admin.addToCart(In[(pilih - 1)]);
                In[(pilih - 1)].setStok(In[(pilih - 1)].getStok()- 1);
                pro = true;
            }
           else if (pilih == 90){
               int y;
                   System.out.print(" barang ke : ");
                   y = why.nextInt();
                   In[(y-1)].dispB();
                   System.out.println(" ");
                   pro = true;

           }
            else if (pilih == 99) {
                admin.showFromCart();
                pro = false;
                System.out.println();
                System.out.println("0.Checkout");
                System.out.print("Pilihan : ");
                //try {
                int cek = why.nextInt();
                if (cek == 0) {
                    admin.checkOutFromCart();
                    System.out.println("1. lanjut belanja");
                    System.out.println("9. menu awal");
                    System.out.println("-1. keluar");
                    System.out.print("Pilihan : ");
                    int cc = why.nextInt();
                    if (cc == -1) {
                        System.exit(0);
                    } else if (cc == 9) {
                        admin.setMenu(true);
                        admin.onlineShop();
                    } else if (cc == 1) {
                        pro = true;
                    }
                }

                else {
                    System.out.println("input tidak valid!");
                    cek = why.nextInt();
                }
            }

        }


        }
    }