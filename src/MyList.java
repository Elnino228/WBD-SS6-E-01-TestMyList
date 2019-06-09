import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements=new Object[capacity];
    }

    public void add(int index,E element) {
        if (size==DEFAULT_CAPACITY) {
            ensureCapacity(elements.length+1);
        }
        for (int i=size-1;i>=index;i--) {
            elements[i+1]=elements[i];
        }
        size++;
        elements[index]=element;
    }
    public E remove(int index) {
        if (size>0) {
            E element=(E)elements[index];
            for (int i=index;i<size-1;i++) {
                elements[i]=elements[i+1];
            }
            elements[size-1]=null;
            size--;
            return element;
        } else return null;
    }
    public int size() {
        return size;
    }
    public MyList<E> clone() {
        MyList<E> newElements=new MyList<E>(elements.length);
        for (int i=0;i< size;i++) {
            newElements.add(i,(E)elements[i]);
        }
        return newElements;
    }
    public  boolean contains(E o) {
        boolean hasElenment=false;
        for (int i=0;i<size;i++) {
            if (elements[i]==o) {
                hasElenment=true;
                break;
            }
        }
        return hasElenment;
    }
    public int indexOf(E o) {
        for (int i=0;i<size;i++) {
            if (elements[i]==o) {
                return i;
            }
        }
        return -1;
    }
//    public boolean add(E e) {
//        if (size<=elements.length) {
//            elements[size]=e;
//            size++;
//            return true;
//        }
//
//    }
    private void ensureCapacity(int minCapacity) {
        elements= Arrays.copyOf(elements,minCapacity);
    }
    public E get(int index) {
        return (E)elements[index];
    }
    public  void clear() {
        elements=new Object[elements.length];
    }
}
