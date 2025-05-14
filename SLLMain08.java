import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas, ipk);
            sll.addLast(mhs); 
        }

        System.out.println("\nIsi Linked List setelah input:");
        sll.print();
        sc.close();
    }
}
