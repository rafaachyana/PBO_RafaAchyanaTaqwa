package jobsheet7;

public class Pegawai {
    private String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    public String getInfo() {
        String info = "";
        info += "NIP                  : " + this.nip + "\n";
        info += "Nama                 : " + this.nama + "\n";
        info += "Gaji                 : " + this.gaji + "\n";
        return info;
    }
}

