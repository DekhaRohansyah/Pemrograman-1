package Tugas;

import java.util.Scanner;
public class Tugas_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis kendaraan (1=mobil / 0=motor): ");
        int jenis = input.nextInt();

        System.out.print("Lama parkir (jam): ");
        int jam = input.nextInt();
        if (jenis == 1) {
            // a: mobil
            if (jam > 3) {
                System.out.println("Biaya: 10000");
            } else {
                System.out.println("Biaya: 5000");
            }
        } else {
            // b: motor
            if (jam > 3) {
                System.out.println("Biaya: 5000");
            } else {
                System.out.println("Biaya: 2000");
            }
        }
    }
}