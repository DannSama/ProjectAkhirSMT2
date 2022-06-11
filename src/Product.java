
public class Product extends Barang{
    int i;
    private int[] proCoutn = new int[20];
    public Product(String name, int stock, double price) {
        super.nama=name;
        super.stok=stock;
        super.price=price;
    }

    @Override
    void info() {
        for (int u = 0 ; u<= proCoutn.length;u++){

        }
    }
}
