import java.util.Scanner;
public class BarangOut extends BarangIn{
    Scanner read = new Scanner(System.in);
    private BarangIn listb[];
    private int productCount;

    public BarangOut() {
        listb = new  BarangIn[10];
        productCount = 0;
    }

    public void addToCartProcess(BarangIn barangIn) {
        this.listb[productCount] = barangIn;
        this.productCount++;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < productCount; i++) {
            total += listb[i].getprice();
        }
        //System.out.println("Total Harga : " + total);
        return total;
    }

    public void displayAllProduct() {
        for (int i = 0; i < productCount; i++) {
            System.out.println("|1  | " + listb[i].getNama() + " \t\t\t\t\t\t| " + listb[i].getprice() + " \t\t\t| ");

        }
        System.out.println("Jumlah Barang Di keranjang Belanja : " + productCount);
        calculateTotal();
    }

    public int getProductCount() {
        return productCount;
    }

    public void resetShoppingCart() {
        listb = new BarangIn[25];
        productCount = 0;
    }

    @Override
    public void info() {
        super.info();
        String pill;
        System.out.println("riwayat penjualan : ");
        for (int i = 0; i < productCount; i++) {
            System.out.println("|1  | " + listb[i].getNama() + " \t\t\t\t\t\t| " + listb[i].getprice() + " \t\t\t| ");

        }
        System.out.println("total income : "+calculateTotal());
        System.out.println("hapus riwayat :  y / n");
        pill = read.next();
        if (pill.equalsIgnoreCase("y")){
            resetShoppingCart();
        }
        else if (pill.equalsIgnoreCase("n")){
            return;
        }
    }
}
