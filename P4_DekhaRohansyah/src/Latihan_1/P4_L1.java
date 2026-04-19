package Latihan_1;
import java.util.Scanner;
public class P4_L1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float kehadiran, realisasi;
        float tugasNilai, nilaiUTS, nilaiUAS;
        float presensi, tugas, uts, uas, total;

        // INPUT
        System.out.print("Masukin Kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Masukin Realisasi: ");
        realisasi = input.nextFloat();

        if (realisasi == 0) {
            System.out.println("Realisasi tidak boleh 0!");
            return;
        }

        System.out.print("Masukin Nilai Tugas: ");
        tugasNilai = input.nextFloat();

        System.out.print("Masukin Nilai UTS: ");
        nilaiUTS = input.nextFloat();

        System.out.print("Masukin Nilai UAS: ");
        nilaiUAS = input.nextFloat();

        // HITUNG NILAI
        presensi = (kehadiran / realisasi) * 10;
        tugas = tugasNilai * 0.2f;
        uts = nilaiUTS * 0.3f;
        uas = nilaiUAS * 0.4f;

        total = presensi + tugas + uts + uas;

        // ATURAN DOSEN (WAJIB)
        int V = 21 * 75 / 100;

        // OUTPUT NILAI
        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai Presensi: " + presensi);
        System.out.println("Nilai Tugas   : " + tugas);
        System.out.println("Nilai UTS     : " + uts);
        System.out.println("Nilai UAS     : " + uas);
        System.out.println("Total Nilai   : " + total);

        // GRADE
        System.out.print("Grade: ");
        if (kehadiran < V) {
            System.out.println("E (Tidak lulus karena absensi)");
        } else {
            if (total >= 80) {
                System.out.println("A");
            } else if (total >= 70) {
                System.out.println("B");
            } else if (total >= 60) {
                System.out.println("C");
            } else if (total >= 55) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}