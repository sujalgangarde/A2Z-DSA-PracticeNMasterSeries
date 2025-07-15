public class DLL {
    
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }



    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLastWithoutTail(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        tail = node;
        size++;
    }

    public void insertLastWithTail(int val) {
        Node node = new Node(val);
        if(tail == null) {
            insertFirst(val);
            return;
        }
        node.next = null;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int index, int val) {

        if(index == 0) {
            insertFirst(val);
            return;
        }
        
        if(index == size) {
            insertLastWithTail(val);
            return;
        }
        
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp.prev);
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
        node.prev = temp;
        size += 1;

    }

    public Node findNode(int value) {
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int afterThisVal, int value) {
        Node previous = findNode(afterThisVal);
        if (previous == null) {
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = previous.next;
        previous.next = node;
        node.prev = previous;
        if(node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        Node last = null;

        System.out.println("Forward DLL:");
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL");

        System.out.println("Backward DLL:");
        while (last != null) {
            System.out.print(last.value + " <--> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }

    public void displayReverseWithTail() {
        System.out.println("Reverse Display with Tail:");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
    
    public void displayDLL(){
        System.out.println("Display DLL:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println("Head: " + head.value + " at : 0");
        System.out.println("Tail: " + tail.value + " at : " + (size - 1));
        System.out.println("Size: " + size);
    }

}