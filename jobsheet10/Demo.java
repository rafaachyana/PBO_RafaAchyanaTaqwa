package jobsheet10;
import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

        Pegawai pegawai1 = dosen1;

        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();
        
        Dosen newDosen = (Dosen) pegawai1;
        System.out.println(newDosen.nama);
        System.out.println(newDosen.nidn);
        newDosen.mengajar();

        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);
    }
    public static void train(Pegawai pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/juknis");

        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }    
    }    
}