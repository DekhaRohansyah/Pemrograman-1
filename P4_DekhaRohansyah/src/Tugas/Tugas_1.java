package Tugas;

import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu (°C): ");
        double suhu = input.nextDouble();

        System.out.println("\nAnalisis suhu kocak:");

        if (suhu < 20) {
            System.out.println("Brrr... dingin banget, siapin jaket tebal!");
        } else if (suhu <= 30) {
            System.out.println("Waduh, suhu nyaman. Bisa santai-santai nih ");
        } else {
            System.out.println("Panas banget! Kayak oven, jangan lupa minum air!");
        }
    }
}