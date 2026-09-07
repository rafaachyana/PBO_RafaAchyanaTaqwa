public class DragonMain {
    public static void main(String[] args) {
        Dragon Flames = new Dragon();
        System.out.println("Posisi Awal");
        Flames.printStatus();
        Flames.changeDirection(2);
        Flames.move(10);
        Flames.changeDirection(1);
        Flames.move(5);
        System.out.println("Posisi Setelah Bergerak");
        Flames.printStatus();

        Dragon Ice = new Dragon();
        System.out.println("Posisi Awal");
        Ice.printStatus();
        Ice.changeDirection(1);
        Ice.move(20);
        Ice.changeDirection(4);
        Ice.move(10);
        System.out.println("Posisi Setelah Bergerak");
        Ice.printStatus();
    }
}
