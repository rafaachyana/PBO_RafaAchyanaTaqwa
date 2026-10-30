package jobsheet4.bimbinganSkripsi;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("19850101", "Dr. Ismail Ahmed Kanabawi, M.T.");
        Dosen d2 = new Dosen("19900202", "Usman Abdul Jalil Shisha, M.Kom.");

        Mahasiswa mhs1 = new Mahasiswa("2241720001", "Khalid Kashmiri");
        mhs1.setPembimbingUtama(d1);
        mhs1.setPembimbingPendamping(d2);

        mhs1.tambahBimbingan(LocalDate.of(2026, 3, 10), true);  // Pembimbing Utama
        mhs1.tambahBimbingan(LocalDate.of(2026, 3, 18), false); // Pembimbing Pendamping

        System.out.println(mhs1.getInfo());

        Mahasiswa mhs2 = new Mahasiswa("2241720002", "Khidir Karawita");
        System.out.println(mhs2.getInfo());

        d2.setNama("Rafa Achyana");
    }
}