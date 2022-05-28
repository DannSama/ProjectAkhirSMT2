public class Barang {
    private String nama;
    private double harga;
    private int stock;

    public Barang(String nama, double harga, int stock) {
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void dispSt(){
        System.out.println("nama barang : "+nama);
        System.out.println("harga barang : "+harga);
        System.out.println("stok barang : "+stock);
    }
}
