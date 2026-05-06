import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pilihan: ");
        int m = input.nextInt();

        if (m == 1) {
            System.out.println("Anda memilih 1");
        } else if (m == 2) {
            System.out.println("Anda memilih 2");
        } else if (m == 3) {
            System.out.println("Anda memilih 3");
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}

