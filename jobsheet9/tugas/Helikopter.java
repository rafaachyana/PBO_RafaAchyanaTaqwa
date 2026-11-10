package jobsheet9.tugas;

public class Helikopter implements Entitas {
    public String nama;
    public int health;
    public int level;
    public int bensin;

    public Helikopter(String nama, int health, int level, int bensin) {
        this.nama = nama;
        this.health = health;
        this.level = level;
        this.bensin = bensin;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public boolean isHidup(int health) {
        return health > 0;
    }

    @Override
    public void attack(int attack) {
        System.out.println(nama + " menyerang dengan kekuatan " + attack);
    }

    @Override
    public void heal(int heal) {
        health += heal;
        System.out.println(nama + " memulihkan health sebanyak " + heal);
        System.out.println("Health saat ini: " + health);
    }

    public void isTerbang() {
        if (bensin > 0) {
            System.out.println(nama + " sedang terbang.");
        } else {
            System.out.println(nama + " tidak bisa terbang karena bensin habis.");
        }
    }

    public void getInfo() {
        System.out.println("Informasi Helikopter");
        System.out.println("Nama   : " + nama);
        System.out.println("Health : " + health);
        System.out.println("Level  : " + level);
        System.out.println("Bensin : " + bensin);
        System.out.println("Hidup  : " + isHidup(health));
    }
}