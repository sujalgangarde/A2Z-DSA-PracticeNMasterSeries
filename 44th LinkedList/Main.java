
public class Main {


    public static void main(String[] args) {
        
    // Inbuilt LinkedList By Java
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.remove(0);
        // System.out.println(list.get(0));
        // list.add(3);
        // list.add(4);
        // System.out.println(list);
        // System.out.println();


        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.display();
        list.insertLast(17);
        list.insertLast(19);
        list.display();
        list.insertAtIndex(1, 5);
        list.display();
        list.insertAtIndex(0, 1);
        list.insertLast(45);
        list.display();
        System.out.println("Deleted First: " + list.deleteFirst());
        list.display();
        System.out.println("Deleted Last: " + list.deleteLast());
        list.display();
        int i = 3;
        System.out.println("Deleted at " + i + ": " + list.deleteAtIndex(i));
        list.display();
        System.out.println(list.findNode(5));
        System.out.println();
        list.displayLL();

    }

}
