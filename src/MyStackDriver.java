/**
 * Program to test drive MyStack class's deep copy
 * CSC201 - Assignment 13.8
 * @author Laura Witherspoon
 */

public class MyStackDriver {

    public static void main (String[] args) throws CloneNotSupportedException {

        MyStack cloneableList = new MyStack();

        cloneableList.push(1);
        cloneableList.push(2);
        cloneableList.push(3);

        // Display original stack list
        System.out.print("Original List: ");
        System.out.println(cloneableList + "\n");

        // Cloning original stack list
        System.out.println("Cloning the original list...\n");
        MyStack newList = (MyStack)cloneableList.clone();

        // Display new list
        System.out.print("New List: ");
        System.out.println(newList + "\n");

        // Change something about original list
        System.out.println("Removing last item from original list...\n");
        cloneableList.pop();

        // Display both lists to prove they're not pointing at same spot in memory
        System.out.println("Display both lists to prove they point at different memory spots");
        System.out.print("Original List: ");
        System.out.println(cloneableList);
        System.out.print("New List: ");
        System.out.println(newList);
    }
}
