package jobsheet7;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    //public Pegawai() {
        //System.out.println("Ini constructor class Pegawai");
    //}

        public Pegawai( String nip, String nama, double gaji) {
            this.nip = nip;
            this.nama = nama;   
            this.gaji = gaji;
        }

    public String getInfo() {
        String info = "";
        info += "NIP                  : " + this.nip + "\n";
        info += "Nama                 : " + this.nama + "\n";
        info += "Gaji                 : " + this.gaji + "\n";
        return info;
    }
}

