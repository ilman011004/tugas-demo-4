import java.util.Scanner;

public class PerhitunganWaktu {
    public static void main(String[] args) {
        double jarak;
        double kecepatan;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jarak :");
        jarak = input.nextInt();
        System.out.println("masukkan kecepatan :");
        kecepatan = input.nextInt();

        // Jarak dalam kilometer

        // Kecepatan rata-rata dalam kilometer per jam


/**
 * Rumus mencari waktu
 */
        // Menghitung waktu dengan rumus jarak dibagi kecepatan
        double waktu = jarak / kecepatan;

        System.out.println("Jarak (km): " + jarak);
        System.out.println("Kecepatan (km/jam): " + kecepatan);
        System.out.println("Waktu (jam): " + waktu);

    }
}


