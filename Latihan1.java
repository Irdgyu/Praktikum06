public class Latihan1 {
    public static void main(String[] args) {
        
        int bil1, bil2, bil3, bilTerbesar;
        bil1 = 28;
        bil2 = 54;
        bil3 = 15;
        
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilTerbesar = bil1;
            } 
            else {
                bilTerbesar = bil3;
            }
        }
        else {
            if (bil2 > bil3) {
                bilTerbesar = bil2;
            }
            else {
                bilTerbesar = bil3;
            }
        }

        System.out.println("bil1 = " + bil1);
        System.out.println("bil2 = " + bil2);
        System.out.println("bil3 = " + bil3);
        System.out.println("bilangan terbesar = " + bilTerbesar);
    }
}