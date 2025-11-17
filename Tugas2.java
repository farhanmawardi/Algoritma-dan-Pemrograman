import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String golongan;
        int jamLembur;
        int gajiPokok = 0;
        double persentaseLembur = 0;
        double gajiLembur;
        double totalPenghasilan;
        
        // Input data karyawan
        System.out.println("=== PROGRAM PERHITUNGAN GAJI KARYAWAN ===");
        System.out.println();
        
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();
        
        System.out.println();
        
        // Proses penentuan gaji pokok berdasarkan golongan
        switch (golongan) {
            case "A":
                gajiPokok = 5000000;
                break;
            case "B":
                gajiPokok = 6500000;
                break;
            case "C":
                gajiPokok = 9500000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                System.exit(0);
        }
        
        // Proses penentuan persentase lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            persentaseLembur = 0.30;
        } else if (jamLembur == 2) {
            persentaseLembur = 0.32;
        } else if (jamLembur == 3) {
            persentaseLembur = 0.34;
        } else if (jamLembur == 4) {
            persentaseLembur = 0.36;
        } else if (jamLembur >= 5) {
            persentaseLembur = 0.38;
        } else {
            persentaseLembur = 0;
        }
        
        // Perhitungan gaji lembur dan total penghasilan
        gajiLembur = gajiPokok * persentaseLembur;
        totalPenghasilan = gajiPokok + gajiLembur;
        
        // Output hasil
        System.out.println("=== HASIL PERHITUNGAN GAJI ===");
        System.out.println("Golongan          : " + golongan);
        System.out.println("Gaji Pokok        : Rp. " + String.format("%,d", gajiPokok));
        System.out.println("Jam Lembur        : " + jamLembur + " jam");
        System.out.println("Persentase Lembur : " + (int)(persentaseLembur * 100) + "%");
        System.out.println("Gaji Lembur       : Rp. " + String.format("%,.0f", gajiLembur));
        System.out.println("Total Penghasilan : Rp. " + String.format("%,.0f", totalPenghasilan));
        
        input.close();
    }
}
