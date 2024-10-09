import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        String merek,kategori;
        byte ukuran;
        int harga;

        System.out.print("Masukkan merek sepatu yang anda beli : ");
        merek = input6.nextLine();
        System.out.print("Masukkan kategori sepatunya : ");
        kategori = input6.nextLine();
        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input6.nextByte();

        if (merek.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori sepatu tidak tersedia");
            }
        }
        else if (merek.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1000000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori sepatu tidak tersedia");
            }
        }
        else if (merek.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1500000;
                    System.out.println("Harga sepatu : Rp. " + harga);
                }
                else {
                    System.out.println("Ukuran tidak tersedia");
                }
            }
            else {
                System.out.println("Kategori sepatu tidak tersedia");
            }
        }
        else {
            System.out.println("Merek sepatu tidak tersedia");
        }
    }
}