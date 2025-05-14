public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("Bimon", "23212201", "2B", 3.8);
        Mahasiswa08 mhs3 = new Mahasiswa08("Cintia", "22212202", "3C", 3.5);
        Mahasiswa08 mhs4 = new Mahasiswa08("Dirga", "21212203", "4D", 3.6);


        sll.addFirst(mhs1);   
        sll.addFirst(mhs2); 
        sll.addFirst(mhs3);
        sll.addFirst(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();  
        sll.removeLast();  
        sll.print();     

        sll.removeAt(0);    
        sll.print();       
    }
}
