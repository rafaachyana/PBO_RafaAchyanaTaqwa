package jobsheet9;

public class TV extends AlatElektronik implements Audible{
    public String jenisLayar;
    public int volume;
    
    @Override
    public void naikkanVolume() {
        volume += 1;
    }
    @Override
    public void turunkanVolume() {
        volume -= 1;    
    }
    
    public TV(String merk, double harga, String warna, String jenisLayar, int volume) {
        super(merk, harga, warna);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nJenis Layar: " + jenisLayar + " inci" +"\nVolume: " + volume;
    }
}
