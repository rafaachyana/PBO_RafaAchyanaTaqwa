package jobsheet4.bimbinganSkripsi;
import java.time.LocalDate;

public class Bimbingan {
    private LocalDate tanggal;
    private boolean isDosen; // true = Pembimbing Utama, false = Pembimbing Pendamping

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public boolean getIsDosen() {
        return isDosen;
    }

    public void setIsDosen(boolean isDosen) {
        this.isDosen = isDosen;
    }

    public String getInfo() {
        String jenis = isDosen ? "Pembimbing Utama" : "Pembimbing Pendamping";
        return "\tTanggal: " + tanggal + ", Jenis Pembimbing: " + jenis;
    }
}