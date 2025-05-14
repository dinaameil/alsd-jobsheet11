import java.util.Scanner;

public class MainALUK08 {
    public static void main(String[] args) {
        QueueLayananMahasiswa08 antrian = new QueueLayananMahasiswa08();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Mahasiswa Terdepan & Terakhir");
            System.out.println("7. Tampilkan Jumlah Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble(); sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa08(nama, nim, kelas, ipk));
                    break;
                case 2:
                    antrian.panggilMahasiswa();
                    break;
                case 3:
                    antrian.cekAntrianKosong();
                    break;
                case 4:
                    antrian.kosongkanAntrian();
                    break;
                case 5:
                    antrian.tampilkanAntrian();
                    break;
                case 6:
                    antrian.tampilkanDepanBelakang();
                    break;
                case 7:
                    antrian.tampilkanJumlah();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
