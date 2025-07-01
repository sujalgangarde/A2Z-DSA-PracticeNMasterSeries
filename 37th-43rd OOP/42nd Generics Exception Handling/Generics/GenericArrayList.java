
public class GenericArrayList<T extends Number> {

    private Object[] data;
    private static int SIZE = 10;
    private int size = 0;

    public GenericArrayList() {
        this.data = new Object[SIZE];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] newArray = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
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

        GenericArrayList<Integer> list = new GenericArrayList<>();
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
