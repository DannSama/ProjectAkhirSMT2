public abstract class Barang {
    protected int stok;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    abstract void info();
}




