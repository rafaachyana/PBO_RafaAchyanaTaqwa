package jobsheet9;

public class Main {
    public static void main(String[] args) {

        Kulkas kulkas = new Kulkas("Samsung", 4500000, "Silver", 2, -10);

        TV tv1 = new TV("LG", 3500000, "Hitam", "LED", 20);

        Kipas kipas1 = new Kipas("Toshiba", 500000, "Putih", "Kipas Angin Meja");

        SmartFridge smartFridge = new SmartFridge("Panasonic", 8000000, "Putih", 3, -15, 30, "15 inci");

        System.out.println("INFORMASI KULKAS");
        System.out.println(kulkas.getInfo());

        System.out.println("\nINFORMASI TV");
        System.out.println(tv1.getInfo());

        System.out.println("\nINFORMASI KIPAS");
        System.out.println(kipas1.getInfo());

        System.out.println("\nINFORMASI SMART FRIDGE");
        System.out.println(smartFridge.getInfo());
    }
}
