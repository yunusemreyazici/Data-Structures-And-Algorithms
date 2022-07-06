# Implementation
- We already created a class by name sngly linked list and to this class, we provided an instance variable of the type ListNode by name head.
```
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
```
- So here the instance variable ListNode by name head will actually hold the linked list for us and we also created one static inner class, ListNode, in our Lesson2, whose constructor only took the data part
- So now let's move ahead and create a singly linked list what we actually saw in the slide in the lesson2.
-so we will create a main method
- inside this main method first we will intialize the singly linked list,
```
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
    public static void main (String[]args){
        SinglyLinkedList sll = new SinglyLinkedList();

    }
}
```
- as soon as we see intialize singly linked list, the value of head is null
- So here we will create the four nodes, what we actually saw in slide in the Lesson2
- So to head we will assign newly created list node having data as 10.
- Then we will create second node having data as,1
- Then we will create a third list node having data as 8
- And finally we will create a fourth list node having data as 11.
```
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
    public static void main (String[]args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);
    }
}
```
- So here we are having four list nodes.
- Now we will connect them together to form a chain which is nothing but our Singly Linked List
- So in order from a chain will first assign the value of second's to head's next.
- Because currently head's next is pointing to null.
- So  this would make the structure something like this.
```
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
    public static void main (String[]args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);
        // Now we will connect them together to form a chain.
        sll.head.next = second; // 10 -->1 
    }
}
```
- Moving ahead.
- We will connect second with third. By assigning value of third to second next.
- So would make structure something like this
- And finally, we will assign the value of fourth to third's next in order to connect third and fourth
- So third next we will assign value of fourth to it.
- So here you can see that we have connected all these 4 nodes together.
- So it would something like this: That 10 is pointing to 1, 1 pointing to 8, 8 is pointing to 11, and finally, 11 next is pointing to null.
- Because there are no more nodes we have attached to this fourth node
```
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
    public static void main (String[]args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);
        // Now we will connect them together to form a chain.
        sll.head.next = second; // 10 -->1
        second.next = third; // 10-->1-->8 
        third.next = four; // 10-->1-->8-->11-->null
    }
}
```
- So this is how we connect the nodes of a singly linked list together.
- In our next lesson, we will discuss a more generic way to insert the node into singly linked list.
- Let' come next chapter!