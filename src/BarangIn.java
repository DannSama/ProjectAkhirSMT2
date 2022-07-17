public class BarangIn extends Barang{
    private int ProCount=0;

    public BarangIn() {
    }

    public void addBarang(String name, double price, int stock){
        super.setNama(name);
        super.setPrice(price);
        super.setStok(stock);
        ProCount++;
    }
    public void dispB(){
        System.out.println("nama : " + getNama());
        System.out.println("harga : " + getprice());
        System.out.println("stok : " +getStok());

    }

    public void info(){
    }

}
