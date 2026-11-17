


public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }
    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertAtIndex(int index, int val) {

        if(index == 0) {
            insertFirst(val);
            return;
        }
        
        if(index == size) {
            insertLast(val);
            return;
        }
        
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;

    }

    // Insert using recursion
    public void insertRec(int index, int val) {
        Node temp = head;
        if(index == 1) {
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            return;
        }
        if(index == 0) {
            Node node = new Node(val);
            node.next = head.next;
            head = node;
            return;
        }
        temp = temp.next;
        index--;
    }

    public int deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int val = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return val;
    
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public int deleteLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (size == 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node node = get(index-1);
        int val = node.next.value;
        node.next = node.next.next;
        return val;
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    public void displayLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println("Head: " + head.value + " at : 0");
        System.out.println("Tail: " + tail.value + " at : " + (size - 1));
        System.out.println("Size: " + size);
    }


}
