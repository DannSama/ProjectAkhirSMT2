public class Barang {
    private String NamaBarang ;
    private Double Tanggal ;
    private Double harga ;
    private int Stok ;

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public void setTanggal(Double tanggal) {
        Tanggal = tanggal;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        Stok = stok;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public Double getTanggal() {
        return Tanggal;
    }

    public Double getHarga() {
        return harga;
    }

    public int getStok() {
        return Stok;
    }

}