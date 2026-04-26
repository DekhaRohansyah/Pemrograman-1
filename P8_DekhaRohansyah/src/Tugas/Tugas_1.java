package Tugas;

import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai);

            System.out.print("Ulangi input? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
    }
}