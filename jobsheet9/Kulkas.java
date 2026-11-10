package jobsheet9;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public Kulkas(String merk, double harga, String warna, int jumlahPintu, int suhuMinimum) {
        super(merk, harga, warna);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nJumlah Pintu: " + jumlahPintu;
    }
}
