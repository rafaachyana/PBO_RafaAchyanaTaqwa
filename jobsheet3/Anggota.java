package jobsheet3;

public class Anggota {
    private String nomorKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal angsuran tidak valid.");
            return;
        }
        
        if (nominal < 0.1 * jumlahPinjaman) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else if (nominal > jumlahPinjaman) {
            System.out.println("Maaf, angsuran melebihi jumlah pinjaman. mau pinnjam lagi?");
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}