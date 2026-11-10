package jobsheet7;

public abstract class BElektronik {
    public String merk;
    public double harga;
    public String warna;
    public int dayaListrik;

    public BElektronik() {
        System.out.println("Constructor BElektronik tanpa parameter");
    }

    public abstract double cekKonsumsiListrikBulanan(int jamPemakaianPerHari);
    
    public BElektronik(String merk, double harga, String warna, int dayaListrik) {
        this.merk = merk;
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
