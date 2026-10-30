package jobsheet7;

public class Kulkas extends BElektronik {
    public int jumlahPintu;
    public int suhuMinimum;

    public Kulkas() {
        System.out.println("Constructor Kulkas tanpa parameter");
    }

    public Kulkas(String merk, double harga, String warna, int dayaListrik, int jumlahPintu, int suhuMinimum) {
        super(merk, harga, warna, dayaListrik);
        this.jumlahPintu = jumlahPintu;
        this.suhuMinimum = suhuMinimum;
        
    }

    public void setSuhu(int suhu) {
        if (suhu <= 0) {
            this.suhuMinimum = suhu;
            System.out.println("Suhu kulkas diatur menjadi " + suhu + " derajat Celsius.");
        } else {
            System.out.println("Suhu minimum kulkas harus " + "0 derajat atau lebih rendah.");
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Informasi Kulkas:");
        super.getInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Suhu Minimum: " + suhuMinimum + " derajat Celsius");
    }
}

