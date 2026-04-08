package M_Fadhil_Rasya_P3;

import java.util.Scanner;

public class tugas3 {
    public static void main (String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("================");
            System.out.print( "Input Kehadiran :");
            int kehadiran = input.nextInt();
            System.out.print("Input Tugas    :");
            int tugas = input.nextInt();
            System.out.print( "Input Uts    :");
            int uts = input.nextInt();
            System.out.print( "Input Uas    :");
            int uas = input.nextInt();

            int realisasi = 21;
            System.out.println( "===============");

            double bKehadiran = ((double) kehadiran / realisasi) * 10 /100;
            double bTugas = (double) tugas  * 20 /100;
            double bUts = (double) uts  * 30 /100;
            double bUas = (double) uas  * 40 /100;
            double total = bKehadiran + bTugas + bUts + bUas;

            System.out.println("Bobot Kehadiran :" + bKehadiran);
            System.out.println("Bobot Tugas :" + bTugas);
            System.out.println("Bobot Uts :" + bUts);
            System.out.println("Bobot Uas :" + bUas);
            System.out.println("Total    :" + total);
        }

    }
}
