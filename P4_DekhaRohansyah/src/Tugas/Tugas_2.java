package Tugas;

import java.util.Scanner;
import java.util.Random;

public class Tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int angka = rand.nextInt(10) + 1; // 1-10

        System.out.println("Tebak angka antara 1-10!");
        System.out.print("Masukkan tebakan: ");
        int tebakan = input.nextInt();

        if (tebakan == angka) {
            System.out.println("Yeay! Kamu jagoan, tepat banget 🎉");
        } else {
            System.out.println("Yah, salah! Angka sebenarnya: " + angka);
        }
    }
}