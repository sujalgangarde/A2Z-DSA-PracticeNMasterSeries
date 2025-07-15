public class CLL {
    
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
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

    public void insertlast(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void deleteVal(int value){
        Node temp = head;
        if(head == null) {
            return;
        }
        if(temp.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            if(temp.next.value == value) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("Again Head: " + head.value);
        }

    }


}
