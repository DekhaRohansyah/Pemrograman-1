package Latihan_1;
import java.util.Scanner;

public class P4_L1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float presensi, tugas, uts, uas;
        float kehadiran, realisasi;
        float tugasNilai, nilaiuts, nilaiuas;
        float total;

        System.out.print("Kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Realisasi: ");
        realisasi = input.nextFloat();

        System.out.print("Tugas : ");
        tugasNilai = input.nextFloat();

        System.out.print("UTS : ");
        nilaiuts = input.nextFloat();

        System.out.print("UAS : ");
        nilaiuas = input.nextFloat();

        presensi = (kehadiran / realisasi) * 10;
        tugas = tugasNilai * 20/100;
        uts = nilaiuts * 30/100;
        uas = nilaiuas * 40/100;
        total = presensi + tugas + uts + uas;

        System.out.println("Nilai Presensi: " + presensi);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);


        System.out.println("Total Nilai: " + total);
    }
}