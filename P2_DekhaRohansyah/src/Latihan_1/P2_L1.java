package Latihan_1;

import java.util.Scanner;
public class P2_L1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama, universitas;
        int usia;

        System.out.print("Input nama: ");
        nama = input.nextLine();

        System.out.print("Input usia: ");
        usia = input.nextInt();
        input.nextLine();

        System.out.print("Input universitas: ");
        universitas = input.nextLine();

        System.out.println("Halo, saya " + nama);
        System.out.println("Usia saya: " + usia);
        System.out.println("Sebagai mahasiswa di " + universitas);
    }
}