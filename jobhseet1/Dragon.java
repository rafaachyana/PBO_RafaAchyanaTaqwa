public class Dragon {
    int x, y, direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 2;
    }

    public void changeDirection(int newDirection) { 
        if(newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            direction = 2;
            System.out.println("Gagal mengubah arah, masukkan angka antara 1-4 untuk mengubah arah");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2: 
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4: 
                x -= steps;
                break;
            default:
                System.out.println("Arah belum ditentukan.");
                break;
        }
    }

    public void printStatus() {
        String namaArah = "";
        switch (direction) {
            case 1: namaArah = "Atas"; break;
            case 2: namaArah = "Kanan"; break;
            case 3: namaArah = "Bawah"; break;
            case 4: namaArah = "Kiri"; break;
            default: namaArah = "Tidak Valid"; break;
        }
        System.out.println("Posisi   : (x: " + x + ", y: " + y + ")");
        System.out.println("Arah     : " + namaArah + " (" + direction + ")\n");
    }
}