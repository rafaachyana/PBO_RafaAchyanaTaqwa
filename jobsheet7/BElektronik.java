package jobsheet7;

public class BElektronik {
    public final String merk = "Samsung";
    public double harga;
    public String warna;
    public int dayaListrik;

    public BElektronik() {
        System.out.println("Constructor BElektronik tanpa parameter");
    }

    public BElektronik(String merk, double harga, String warna, int dayaListrik) {
        this.harga = harga;
        this.warna = warna;
        this.dayaListrik = dayaListrik;
    }

    public void getInfo() {
        System.out.println("Merk        : " + merk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Warna       : " + warna);
        System.out.println("Daya Listrik: " + dayaListrik + " watt");
    }
}
