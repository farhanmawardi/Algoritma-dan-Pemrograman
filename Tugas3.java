import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String golongan;
        int jamLembur;
        int gajiPokok = 0;
        double persentaseLembur = 0;
        double gajiLembur;
        double totalPenghasilan;
        
        // Array untuk menyimpan gaji pokok berdasarkan golongan
        int[] arrayGaji = {5000000, 6500000, 9500000};
        
        // Array untuk menyimpan persentase lembur
        double[] arrayPersenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};
        
        // Input data karyawan
        System.out.println("=== PROGRAM PERHITUNGAN GAJI KARYAWAN ===");
        System.out.println();
        
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();
        
        System.out.println();
        
        // Proses penentuan gaji pokok berdasarkan golongan menggunakan IF dan Array
        if (golongan.equals("A")) {
            gajiPokok = arrayGaji[0];  // Mengambil gaji dari array index 0
        } else if (golongan.equals("B")) {
            gajiPokok = arrayGaji[1];  // Mengambil gaji dari array index 1
        } else if (golongan.equals("C")) {
            gajiPokok = arrayGaji[2];  // Mengambil gaji dari array index 2
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            System.exit(0);
        }
        
        // Proses penentuan persentase lembur berdasarkan jam lembur menggunakan IF dan Array
        if (jamLembur == 1) {
            persentaseLembur = arrayPersenLembur[0];  // 30% dari array index 0
        } else if (jamLembur == 2) {
            persentaseLembur = arrayPersenLembur[1];  // 32% dari array index 1
        } else if (jamLembur == 3) {
            persentaseLembur = arrayPersenLembur[2];  // 34% dari array index 2
        } else if (jamLembur == 4) {
            persentaseLembur = arrayPersenLembur[3];  // 36% dari array index 3
        } else if (jamLembur >= 5) {
            persentaseLembur = arrayPersenLembur[4];  // 38% dari array index 4
        } else {
            persentaseLembur = 0;
        }
        
        // Perhitungan gaji lembur dan total penghasilan menggunakan operator aritmatika
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