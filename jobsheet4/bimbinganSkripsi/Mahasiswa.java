package jobsheet4.bimbinganSkripsi;
import java.time.LocalDate;
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<Bimbingan> riwayatBimbingan;
    private Dosen pembimbingUtama;
    private Dosen pembimbingPendamping;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.riwayatBimbingan = new ArrayList<Bimbingan>();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dosen getPembimbingUtama() {
        return pembimbingUtama;
    }

    public void setPembimbingUtama(Dosen pembimbingUtama) {
        this.pembimbingUtama = pembimbingUtama;
    }

    public Dosen getPembimbingPendamping() {
        return pembimbingPendamping;
    }

    public void setPembimbingPendamping(Dosen pembimbingPendamping) {
        this.pembimbingPendamping = pembimbingPendamping;
    }

    public void tambahBimbingan(LocalDate tanggal, boolean isDosen) {
        Bimbingan bimbingan = new Bimbingan();
        bimbingan.setTanggal(tanggal);
        bimbingan.setIsDosen(isDosen);
        riwayatBimbingan.add(bimbingan);
    }

    public String getInfo() {
        String info = "";
        info += "NIM                  : " + this.nim + "\n";
        info += "Nama                 : " + this.nama + "\n";
        info += "Pembimbing Utama     : " + (pembimbingUtama != null ? pembimbingUtama.getInfo() : "Belum Memiliki Pembimbing") + "\n";
        info += "Pembimbing Pendamping: " + (pembimbingPendamping != null ? pembimbingPendamping.getInfo() : "Belum Memiliki Pembimbing") + "\n";

        if (!riwayatBimbingan.isEmpty()) {
            info += "Riwayat Bimbingan    :\n";
            for (Bimbingan bimbingan : riwayatBimbingan) {
                Dosen d = bimbingan.getIsDosen() ? pembimbingUtama : pembimbingPendamping;
                String namaDosen = (d != null) ? d.getNama() : "Belum Memiliki Pembimbing";
                info += bimbingan.getInfo() + " (Dosen: " + namaDosen + ")\n";
            }
        } else {
            info += "Belum ada riwayat bimbingan\n";
        }
        info += "\n";
        return info;
    }
}