package jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.platNomor = "B 0838 XZ";
        int kecepatanBaru1 = 50;
        
        if (!motor1.statusMesin && kecepatanBaru1 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru1;
        }
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.statusMesin = true; 
        int kecepatanBaru2 = 40;
        
        if (!motor2.statusMesin && kecepatanBaru2 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru2;
        }
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        motor3.statusMesin = false; // Mesin Off
        int kecepatanBaru3 = 60;
        
        if (!motor3.statusMesin && kecepatanBaru3 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanBaru3;
        }
        motor3.displayInfo();
    }
}