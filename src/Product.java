
public class Product extends Barang{

    public Product(String name, int stock, double price) {
        super.nama=name;
        super.stok=stock;
        super.price=price;
    }

    @Override
    void info() {
    }
}
