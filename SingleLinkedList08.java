public class SingleLinkedList08 {
    Node08 head;
    Node08 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print () {
        if (!isEmpty()) {
            Node08 tmp=head;
            System.out.println("Isi Linked List:\t:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        Node08 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void isertAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node08(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}
