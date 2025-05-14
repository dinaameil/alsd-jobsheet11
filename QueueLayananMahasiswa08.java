public class QueueLayananMahasiswa08 {
    SingleLinkedList08 queue = new SingleLinkedList08();

    public void tambahAntrian(Mahasiswa08 mhs) {
        queue.addLast(mhs);
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void panggilMahasiswa() {
        if (!queue.isEmpty()) {
            System.out.print("Mahasiswa dipanggil: ");
            queue.head.data.tampilkanInformasi();
            queue.removeFirst();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cekAntrianKosong() {
        System.out.println(queue.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
    }

    public void kosongkanAntrian() {
        while (!queue.isEmpty()) {
            queue.removeFirst();
        }
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilkanAntrian() {
        queue.print();
    }

    public void tampilkanDepanBelakang() {
        if (!queue.isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            queue.head.data.tampilkanInformasi();
            System.out.print("Mahasiswa terakhir: ");
            queue.tail.data.tampilkanInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanJumlah() {
        int count = 0;
        Node08 temp = queue.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Jumlah mahasiswa yang mengantri: " + count);
    }
}
