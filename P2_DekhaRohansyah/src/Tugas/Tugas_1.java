package Tugas;

import java.util.Scanner;
public class Tugas_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama, universitas;
        double beratBadan, tinggiBadan;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input berat badan (kg): ");
        beratBadan = input.nextDouble();

        System.out.print("Input tinggi badan (cm): ");
        tinggiBadan = input.nextDouble();
        input.nextLine(); // membersihkan newline

        System.out.print("Input universitas: ");
        universitas = input.nextLine();

        System.out.println("\nHalo, saya " + nama);
        System.out.println("Berat badan saya: " + beratBadan + " kg");
        System.out.println("Tinggi badan saya: " + tinggiBadan + " cm");
        System.out.println("Sebagai mahasiswa di " + universitas);
    }
}