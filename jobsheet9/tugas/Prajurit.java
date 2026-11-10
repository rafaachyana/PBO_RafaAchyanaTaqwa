package jobsheet9.tugas;

public class Prajurit implements Entitas {
    public String nama;
    public int health;
    public int level;

    public Prajurit(String nama, int health, int level) {
        this.nama = nama;
        this.health = health;
        this.level = level;
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
        System.out.println(nama + " menyerang dengan damage " + attack);
    }

    @Override
    public void heal(int heal) {
        health += heal;
        System.out.println(nama + " memulihkan health sebesar " + heal);
        System.out.println("Health saat ini: " + health);
    }

    public void sprint() {
        System.out.println(nama + " berlari cepat");
    }

    public void getInfo() {
        System.out.println("Informasi Prajurit");
        System.out.println("Nama   : " + nama);
        System.out.println("Health : " + health);
        System.out.println("Level  : " + level);
        System.out.println("Hidup  : " + isHidup(health));
    }
}