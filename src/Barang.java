public class Barang {
    protected  String NamaBarang ;
    protected  Double Tanggal ;
    protected  Double harga ;
    protected  int Stok ;

    public Barang (String namabarang , Double Tanggal , Double harga , int stok){
        this.NamaBarang = namabarang;
        this.Tanggal= Tanggal;
        this.harga= harga;
        this.Stok = stok;
    }

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
    public void displaybarang(){
        System.out.println("Nama Barang        :" + this.NamaBarang);
        System.out.println("Harga Barang       :" + this.harga);
        System.out.println("Stok Barang        :" + this.Stok);
    }

}


