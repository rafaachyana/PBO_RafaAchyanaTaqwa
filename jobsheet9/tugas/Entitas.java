package jobsheet9.tugas;

public interface Entitas {
    String getNama();
    boolean isHidup(int health);
    void attack(int attack);
    void heal(int heal);
}