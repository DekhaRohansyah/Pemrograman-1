package Latihan_1;

import java.util.Scanner;

public class P7_L1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Msukin kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Msukin Nilai Akhir: ");
        int nilai = input.nextInt();

        int V = 21 * 75 / 100;

        if (kehadiran >= V) {
            // NORMAL
            if (nilai >= 80) {
                System.out.print("Grade : A");
            } else if (nilai >= 70) {
                System.out.print("Grade : B");
            } else if (nilai >= 60) {
                System.out.print("Grade : C");
            } else if (nilai >= 55) {
                System.out.print("Grade : D");
            } else {
                System.out.print("Grade : E");
            }
        } else {
            // SESUAI CATATAN DOSEN
            if (nilai >= 55) {
                System.out.print("Grade : D");
            } else {
                System.out.print("Grade : E");
            }
        }
    }
}