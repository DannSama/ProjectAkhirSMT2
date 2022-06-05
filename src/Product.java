public class Product extends Barang{
    public void jual(int jumlah){

        stok = stok - jumlah;
    }
    public void addSupply(int jumlah) {

        stok = stok + jumlah;
    }
    @Override
    void info() {
        System.out.println("Stok :" + stok);
    }


    protected String nama;
    protected int stok;
    protected double price;

    public Product ( String nama , int Stok , double price){
        this.nama = nama ;
        this.stok = Stok;
        this.price = price;

    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getStok() {
        return stok;
    }

    public double getPrice() {
        return price;
    }


}


