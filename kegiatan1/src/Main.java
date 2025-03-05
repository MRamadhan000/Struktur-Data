import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Judul Buku: ");
        String title = scanner.nextLine();

        System.out.print("Masukkan Nama Pengarang: ");
        String author = scanner.nextLine();

        System.out.print("Masukkan Harga Buku: ");
        double price = scanner.nextDouble();

        System.out.println("Pilih Kategori Buku:");
        Kategori[] categoryValues = Kategori.values();
        for (int i = 0; i < categoryValues.length; i++) {
            System.out.println((i + 1) + ". " + categoryValues[i]);
        }
        System.out.print("Masukkan nomor kategori: ");
        int category = scanner.nextInt();

        Buku<String, String> buku = new Buku<>(title, author, price, categoryValues[category - 1]);

        buku.displayInfo();

        scanner.close();
    }
}