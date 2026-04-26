package Tugas;

import java.util.Scanner;
public class Tugas_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukin total belanja: ");
        int belanja = input.nextInt();

        System.out.print("Apakah member? (1=ya / 0=tidak): ");
        int member = input.nextInt();
        if (member == 1) {
            // a: member
            if (belanja >= 100000) {
                System.out.println("Diskon 20%");
            } else {
                System.out.println("Diskon 10%");
            }
        } else {
            // b: bukan member
            if (belanja >= 100000) {
                System.out.println("Diskon 5%");
            } else {
                System.out.println("Tidak dapat diskon");
            }
        }
    }
}