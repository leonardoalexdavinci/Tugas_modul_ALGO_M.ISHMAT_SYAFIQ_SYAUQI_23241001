import java.util.Scanner;
public class App {
        public static void main(String[] args) {
            Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukan Bilangan =");
        int angka = bilangan.nextInt();

        int hasil = angka % 2;

        String kondisi = hasil == 0? "Genap" : "ganjil";
        System.out.println("Bilangan tersebut adalah :");
        System.out.println(kondisi);
        }
}