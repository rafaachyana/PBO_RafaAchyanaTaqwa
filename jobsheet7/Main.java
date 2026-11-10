package jobsheet7;

public class Main {
    public static void main(String[] args) {

        Kulkas kulkas1 = new Kulkas("Samsung",4500000,"Silver",150,2,-10);

        TV tv1 = new TV("LG",3500000,"Hitam",100,"43 inci","LED",20);

        TV tv2 = new TV();

        kulkas1.getInfo();
        kulkas1.setSuhu(-8);
        System.out.println("Estimasi Konsumsi Energi (24 jam/hari): " + kulkas1.cekKonsumsiListrikBulanan(24) + " kWh/bulan");

        tv1.getInfo();
        tv1.setVolume(30);
        System.out.println("Estimasi Konsumsi Energi (6 jam/hari) : " + tv1.cekKonsumsiListrikBulanan(6) + " kWh/bulan");

        tv2.getInfo();
        tv2.setVolume(35);
        System.out.println("Estimasi Konsumsi Energi (6 jam/hari) : " + tv2.cekKonsumsiListrikBulanan(6) + " kWh/bulan");
    }
}
