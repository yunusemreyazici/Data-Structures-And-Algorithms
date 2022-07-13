public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data; //Generic Type
        private ListNode next;
        public ListNode(int data){
            this.data= data;
            this.next=null;
        }
    }
}