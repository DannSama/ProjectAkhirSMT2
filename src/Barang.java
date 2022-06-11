public abstract class Barang {
    //abstrak / kelas induk
    protected int stok;// protected --> Menyatakan bahwa kelas/method/attribute tersebut dapat diakses oleh kelas lain
    protected String nama;
    protected double price;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void info();

}




