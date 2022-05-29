import java.util.Scanner;
public class BarangKeluar extends Barang {
    private double JumlahBarang ;
    private double SisaStok;
    private double NoBarang;
    private double totalpembelian;


    Scanner pembelian = new Scanner(System.in);

    public BarangKeluar(String namabarang, Double Tanggal, Double harga, int stok) {
        super(namabarang, Tanggal, harga, stok);
    }

    public void BarangKeluar(double jumlahBarang,double sisaStok){
        this.JumlahBarang = jumlahBarang;
        this.SisaStok = sisaStok;

    }

    public void setJumlahBarang(double jumlahBarang) {
        JumlahBarang = jumlahBarang;
    }

    public void setSisaStok(double sisaStok) {
        SisaStok = sisaStok;
    }

    public double getJumlahBarang() {
        return JumlahBarang;
    }

    public double getSisaStok() {
        return SisaStok;
    }



    public void setNoBarang(double noBarang) {
        NoBarang = noBarang;
    }

    public double getNoBarang() {
        return NoBarang;
    }

    public void setTotalpembelian(double totalpembelian) {
        this.totalpembelian = totalpembelian;
    }

    public double getTotalpembelian() {
        return totalpembelian;
    }

    public void BarangKeluar(){
        //No barang
        int no ;
        for( int i = 0 ; i < 10 ; i++){
            System.out.println("No ke-%i\n" + i);
        }
        return  ;
    }
    public void StokKeluar(){
        double TotalStok = getStok() - getSisaStok();
    }
    public void jumlahBarang(){
         SisaStok = Stok - pembelian.nextInt();

    }



}
