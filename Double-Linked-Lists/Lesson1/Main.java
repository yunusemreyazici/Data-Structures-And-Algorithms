public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
         dll.insertLast(1);
         dll.insertLast(10);
         dll.insertLast(15);
        // dll.insertLast(25);
        // dll.displayForward();
        // dll.displayBackward();
        // dll.insertFirst(1);
        // dll.insertFirst(10);
        dll.displayForward();
        dll.deleteFirst();
        dll.deleteLast();
        // dll.displayBackward();
        dll.displayForward();
    }
}
