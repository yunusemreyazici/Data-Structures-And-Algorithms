public class Main {

    public static void main(String[] args) {

        CircularSinglyLinkedList csll= new CircularSinglyLinkedList();
       // csll.createCircularLinkedList();

    //    csll.insertFirst(10);
    //    csll.insertFirst(15);
    //    csll.insertFirst(25);

       csll.display();
        csll.insertLast(12);
        csll.insertLast(6);;
        csll.insertLast(8);;
        csll.display();
        csll.removeFirst();
        csll.removeFirst();
        csll.removeFirst();
        csll.removeFirst();
        csll.display(); 
    }

}
