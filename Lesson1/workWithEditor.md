# Create Singly linked list class
- Open your editor and create SinglyLinkedList.java
- and create SinglyLinkedList class
```
public class SinglyLinkedList{

}
```
- We know SLL usually has a head node which actually holds the complate list
- So first we'll create a instance(Turkish meaning:"Örnek") varriable
```
public class SinglyLinkedList{
    private ListNode head;

}
```
- Now as we have created the head of type ListNode
- We have to create the ListNode class
- We also talk about that Singly Linked List internally(Turkish meaning:"İçten") contains ListNode class
- So we will create a static class by the name ListNode.
- And we also discussed that this ListNode has two properties.
- One is "data" property and the other is the pointer to the next node in the list.
- Usually, these data type can be any generic type but in this tutorial and upcoming tutorial,We will be taking as an int type. 
- We will also create a ListNode variable having name is next because this next will be pointing to the next node in Singly Linked List.
```
public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data; //Generic Type
        private ListNode next;
    }

}
```
- We also provide the constructor
- Now, this constructor will take the data part.
- So whenever we create a list node we only provide this data part because when a new ListNode is created it's next by default points to null
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
- So this is how we actually represent a Singly Linked List in java.
- Next tutorial , we will be using this class and also provide other methods
- Let's come next Lesson!!