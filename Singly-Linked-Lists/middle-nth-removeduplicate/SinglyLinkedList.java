// Find, insertBegining, PrintLinkedList, GetMiddleNode, GetNthFromEnd, RemoveDuplicates, InsertSortedList, DeleteNode,
// ContainsLoop, DetectStartLoop, -LoopList-, 
public class SinglyLinkedList {

    private ListNode head;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean find(int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.print("null");
        }
        ListNode current = head;
        while (null != current) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid Value:" + n);

        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public ListNode getNthYuem(int n) {
        ListNode slowPtr;
        ListNode fastPtr;
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("0 and other increase value is not expected. You entered this :" + n);
        }
        slowPtr = head;
        fastPtr = head;
        while (slowPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertSortedList(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void deleteNode(int key) { // thats most diffucult
        ListNode current = head;
        ListNode temp = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;
    }

    public boolean containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    public ListNode findPointer() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                removeLoop(slowPtr);
            }
        }
        return null;
    }

    private void removeLoop (ListNode slowPtr){
        ListNode temp=head;
        while (temp.next!= slowPtr.next) {
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=null;
    }
    public void loopLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eight = new ListNode(8);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = fourth;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.insertAtBeginning(5);
        // sll.insertAtBeginning(4);
        // sll.insertAtBeginning(3);
        // sll.insertAtBeginning(2);
        // sll.insertAtBeginning(1);
        // sll.printLinkedList();
        // sll.deleteNode(3);
        // sll.printLinkedList();

        sll.loopLinkedList();
        System.out.println(sll.containsLoop());
        sll.findPointer();
        sll.printLinkedList();

        // System.out.println(sll.getNthYuem(1).data);

        // sll.loopLinkedList();
        // System.out.println(".");
        // sll.insertSortedList(11);
        // sll.printLinkedList();

        // sll.removeDuplicates();
        // sll.printLinkedList();
        // ListNode nthNodeFromEnd= sll.getNthNo deFromEnd(3);
        // System.out.println("Nth node from end is: "+nthNodeFromEnd.data);

        // ListNode middleNode = sll.getMiddleNode();
        // System.out.println("Midde node is:"+middleNode.data);

        // if (sll.find(3)) {
        // System.out.println("Search Key found");
        // } else {
        // System.out.println("Search Key not found");
        // }

        // sll.deleteNode(1);
        // sll.printLinkedList();
    }
}