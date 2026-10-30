package jobsheet7;

public class TV extends BElektronik {
    public String ukuranLayar;
    public String jenisPanel;
    public int volume;
    

    public TV() {
        System.out.println("Constructor TV tanpa parameter");
        super.harga = 3000000;
        super.warna = "Hitam";
        super.dayaListrik = 100;
        this.ukuranLayar = "32 inci";
        this.jenisPanel = "LED";
    }

    public TV(String merk, double harga, String warna, int dayaListrik, String ukuranLayar, String jenisPanel, int volume) {
        super(merk, harga, warna, dayaListrik);
        this.ukuranLayar = ukuranLayar;
        this.jenisPanel = jenisPanel;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume TV diatur menjadi " + volume);
        } else {
            System.out.println("Volume harus antara 0 sampai 100.");
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Informasi TV:");
        super.getInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Jenis Panel : " + jenisPanel);
        System.out.println("Volume      : " + volume);
    }
}

