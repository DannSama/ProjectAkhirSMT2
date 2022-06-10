public abstract class Barang {
    //abstrak / kelas induk
    protected int stok; // protected --> Menyatakan bahwa kelas/method/attribute tersebut dapat diakses oleh kelas lain

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    abstract void info();


}




