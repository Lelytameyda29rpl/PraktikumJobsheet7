import java.util.Scanner;

public class ForKelipatan16_Modifikasi1 {

    public static void main(String[] args) {
        Scanner scan16 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        double rataRata = 0.0; // Variabel untuk menyimpan rata-rata

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan16.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        if (counter > 0) { // Memastikan counter tidak nol untuk menghindari pembagian oleh nol
            rataRata = (double) jumlah / counter;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }

}
