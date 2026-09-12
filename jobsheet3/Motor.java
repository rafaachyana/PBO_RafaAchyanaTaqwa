package jobsheet3;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    
    public boolean isStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            this.kecepatan = 0;
        } else if (kecepatan >100){
            System.out.println("Kecepatan melebihi maksimal");
            this.kecepatan = 100;
        } else if (kecepatan < 0){
            System.out.println("Kecepatan tidak boleh negatif");
            this.kecepatan = 0;
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayInfo() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "on" : "off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("================================");
    }
    
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true); 
        motor2.setKecepatan(40);
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();
    }
}
