import java.util.Scanner;

public class Pemilihan2Percobaan206 {

    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        String member, metodePembayaran;
        int jumlahBeli, menu;
        double diskon, harga, totalBayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU CAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. KOPI");
        System.out.println("2. TEH");
        System.out.println("3. ROTI");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");
        menu = input6.nextInt();
        input6.nextLine();
        System.out.println("Apakah anda punya member? (ya/tidak) = ");
        member = input6.nextLine();
        System.out.println("Masukkan metode pembayaran? (qris) = ");
        metodePembayaran = input6.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("ya")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10% ");
            if (menu == 1) {
                harga = 12000;
                System.out.println("Harga kopi = " + harga);

            } else if (menu == 2) {
                harga = 7000;
                System.out.println("Harga teh = " + harga);

            } else if (menu == 3) {
                harga = 20000;
                System.out.println("Harga roti = " + harga);
                
            } else {
                System.out.println("Masukkan menu dengan benar");
                return;
            }

            totalBayar = harga - (harga * diskon);
            
            if (metodePembayaran.equalsIgnoreCase("qris")) {
                System.out.println("Total pembayaran setelah diskon = " + totalBayar);
                totalBayar -= 1000;
                System.out.println("Total bayar memakai qris = " + totalBayar);
            }
            else {
                System.out.println("Total pembayaran setelah diskon = " + totalBayar);
            }

        }
        
        else if (member.equalsIgnoreCase("tidak")) {
            if (menu == 1) {
                harga = 12000;
                System.out.println("Harga kopi = " + harga);

            } else if (menu == 2) {
                harga = 7000;
                System.out.println("Harga teh = " + harga);

            } else if (menu == 3) {
                harga = 20000;
                System.out.println("Harga roti = " + harga);
                
            } else {
                System.out.println("Masukkan menu dengan benar");
                return;
            }
            if (metodePembayaran.equalsIgnoreCase("qris")) {
                System.out.println("Total pembayaran = " + harga);
                harga -= 1000;
                System.out.println("Total bayar memakai qris = " + harga);
            }
            else {
                System.out.println("Total pembayaran = " + harga);
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-----------------------------------------");  
    }
}