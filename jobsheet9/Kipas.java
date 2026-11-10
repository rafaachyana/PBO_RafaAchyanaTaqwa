package jobsheet9;

public class Kipas extends AlatElektronik {
    public String jenis;

    public Kipas(String merk, double harga, String warna, String jenis) {
        super(merk, harga, warna);
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nJenis: " + jenis;
    }
}
