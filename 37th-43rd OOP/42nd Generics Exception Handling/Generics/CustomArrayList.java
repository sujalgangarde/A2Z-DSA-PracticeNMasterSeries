


public class CustomArrayList {

    private int[] data;
    private static int SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[SIZE];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] newArray = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public void add(int value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    


    public static void main(String[] args) {
        
        // ArrayList list = new ArrayList();
        // list.add(23);
        // list.add(45);
        // list.remove(2);
        // list.get(0);

        CustomArrayList list = new CustomArrayList();
        list.add(23);
        list.add(45);
        list.add(67);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.add(89);
        System.out.println(list);
        list.set(0, 100);
        System.out.println(list);
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Size of the list: " + list.size());


    }

}
