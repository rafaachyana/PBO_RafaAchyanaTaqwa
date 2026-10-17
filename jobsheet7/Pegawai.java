package jobsheet7;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    public String finalgetInfo() {
        String info = "";
        info += "NIP                  : " + this.nip + "\n";
        info += "Nama                 : " + this.nama + "\n";
        info += "Gaji                 : " + this.gaji + "\n";
        return info;
    }
}

