package jobsheet9;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public AlatElektronik(String merk, double harga, String warna) {
        this.harga = harga;
        this.merk = merk;
        this.warna = warna;
    }

    public String getInfo() {
        return "Merk: " + merk + "\nHarga: " + harga + "\nWarna: " + warna;
    }
}
