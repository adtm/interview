package Linked_List;

import java.util.HashSet;

public class LinkedList {

    Node head;
    int size;

    LinkedList(int data) {
        head = new Node(data);
        this.size = 0;
    }

    void add(int data) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
        size++;
    }

    void printNodes() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println("-"); // separator
    }

    void removeDuplicates2() {
        if (head == null) return;
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            } 
            current = current.next;
        }
    }

    void removeDuplicates() {
        HashSet<Integer> set = new HashSet<Integer>();
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    // with size
    void kthToLast(int kth) {
        int index = 0;
        Node current = head;
        while ( current != null ) {
            if (index == size - kth) {
                System.out.println(current.data);
                break;
            }
            current = current.next;
            index++;
        }
    }

    // with pointers
    void kthToLastPointers(int kth) {
        int index = 0;
        Node current = head;
        Node behind = head;
        while ( current.next != null ) {
            if (index >= kth) {
               behind = behind.next;
            }
            current = current.next;
            index++;
        }
        System.out.println(behind.data);
    }


    Node get(int index) {
        int counter = 1;
        Node current = head;
        while ( current != null ) {
            if (counter == index) return current;
            current = current.next;
            counter++;
        }
        return null;
    }


    void deleteMiddleNode(Node index) {
        Node next = index.next;
        index.data = next.data;
        index.next = next.next;
    }

}
