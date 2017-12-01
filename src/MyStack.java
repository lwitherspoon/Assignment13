import java.util.ArrayList;

/**
 * Sample cloneable class with deep copy
 * CSC201 - Assignment 13.8
 * @author Laura Witherspoon
 */

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    /**
     * Override clone method defined in Object class
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

        // Get shallow copy of list
        MyStack myStackClone = (MyStack)super.clone();

        // Then copy individual items in list so two lists are equal
        myStackClone.list = cloneList();
        return myStackClone;
    }

    private ArrayList<Object> cloneList() {
        ArrayList<Object> listClone = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            listClone.add(list.get(i));
        }

        return listClone;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}