public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa08(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.printf("%s\t%s\t%s\t%.2f\n", nama, nim, kelas, ipk);
    }
}