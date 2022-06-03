public class BarangMasuk extends Barang{

    public BarangMasuk(String namabarang, Double Tanggal, Double harga, int stok) {
        super(namabarang, Tanggal, harga, stok);
    }
    public void masuk(){
        System.out.println("masuk pak eko!!");
    }
}
