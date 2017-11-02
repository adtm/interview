package Linked_List;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(5);

        linkedList.removeDuplicates();

        linkedList.printNodes();

    }
}
