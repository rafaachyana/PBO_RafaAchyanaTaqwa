package jobsheet9.tugas;

public class Main {
    public static void main(String[] args) {
        Prajurit prajurit1 = new Prajurit("Asep", 80, 1);

        Helikopter helikopter = new Helikopter("Black Hawk", 150, 2, 80);

        prajurit1.getInfo();
        prajurit1.sprint();
        prajurit1.attack(20);
        prajurit1.heal(10);

        System.out.println();

        helikopter.getInfo();
        helikopter.isTerbang();
        helikopter.attack(30);
        helikopter.heal(20);
    }
}