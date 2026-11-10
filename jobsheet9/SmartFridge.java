package jobsheet9;

public class SmartFridge extends Kulkas implements Audible{
    public int volume;
    public String ukuranLayar;
    
    @Override
    public void naikkanVolume() {
        volume += 1;
    }
    @Override
    public void turunkanVolume() {
        volume -= 1;    
    }

    public SmartFridge(String merk, double harga, String warna, int jumlahPintu, int suhuMinimum, int volume, String ukuranLayar) {
        super(merk, harga, warna, jumlahPintu, suhuMinimum);
        this.volume = volume;
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nVolume: " + volume + "\nUkuran Layar: " + ukuranLayar;
    }
}
