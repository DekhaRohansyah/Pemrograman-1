package Latihan_1;
import java.util.Scanner;

public class P5_L1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Masukkan suhu: ");
        int suhu = input.nextInt();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("\n--- HASIL ---");

        // IF saja
        if (suhu > 30) {
            System.out.println("Cuaca panas");
        }

        // IF-ELSE
        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }
        // IF-ELSE IF
        if (umur >= 18) {
            System.out.println("Dewasa");
        } else if (umur >= 13) {
            System.out.println("Remaja");
        } else {
            System.out.println("Anak-anak");
        }
        input.close();
    }
}

