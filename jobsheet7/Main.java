package jobsheet7;

public class Main {
    public static void main(String[] args) {

        Kulkas kulkas1 = new Kulkas("Samsung",4500000,"Silver",150,2,-10);

        TV tv1 = new TV("LG",3500000,"Hitam",100,"43 inci","LED",20);

        TV tv2 = new TV();

        kulkas1.getInfo();
        kulkas1.setSuhu(-8);

        tv1.getInfo();
        tv1.setVolume(30);

        tv2.getInfo();
        tv2.setVolume(35);
    }
}

