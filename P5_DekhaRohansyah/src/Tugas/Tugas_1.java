package Tugas;
import java.util.Scanner;
public class Tugas_1 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid!");
            } else if (nilai >= 85) {
                System.out.println("Grade: A");
                System.out.println("Status: Lulus dengan sangat baik");
            } else if (nilai >= 75) {
                System.out.println("Grade: B");
                System.out.println("Status: Lulus");
            } else if (nilai >= 65) {
                System.out.println("Grade: C");
                System.out.println("Status: Lulus");
            } else if (nilai >= 50) {
                System.out.println("Grade: D");
                System.out.println("Status: Remedial");
            } else {
                System.out.println("Grade: E");
                System.out.println("Status: Tidak Lulus");
            }
        }
    }
}
