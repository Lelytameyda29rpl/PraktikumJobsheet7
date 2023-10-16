import java.util.Scanner;
public class WhileGaji16 {

    public static void main(String[] args) {
        Scanner scan16 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = scan16.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihlah jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan16.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan16.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total gaji lembur: " + totalGajiLembur);
         
    }
    
}
