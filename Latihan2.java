import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        double diskon;
        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input6.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input6.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            }
            else {
                diskon = 0.1;
            }
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            }
            else {
                diskon = 0.08;
            }
        }
        else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
            else {
                diskon = 0;
            }
        }

        System.out.println("Buku yang dibeli : " + jenisBuku);
        System.out.println("Banyak buku yang dibeli : " + jumlahBuku);
        System.out.println("Mendapatkan potongan harga sebesar : " + diskon);
    }
}