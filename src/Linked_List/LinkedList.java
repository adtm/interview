package Linked_List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

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

    void sumList(LinkedList s) {
        int carry = 0;
        while (head != null || s.head != null) {
            if (head != null) {
                carry += head.data;
                head = head.next;
            }

            if (s.head != null) {
                carry += s.head.data;
                s.head = s.head.next;
            }

            System.out.println(carry % 10);
            carry /= 10;
        }
        if (carry > 0) {
            System.out.println(carry);
        }
    }

    Node reverse(Node head) {
        Node next = null;
        Node prev = null;
        Node current = head;
        while ( current != null ) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

       }
       return prev;
    }

    boolean palindrome() {
        Node current = head;
        Node previous = new Node(head.data);

        while (current.next != null) {
            Node temp = new Node(current.next.data);
            temp.next = previous;
            previous = temp;
            current = current.next;
        }

        Node l1 = head;
        Node l2 = previous;
        while (l1 != null) {
            if (l1.data != l2.data) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    boolean stackPalindrome() {
        Node slow = head;
        Node fast = head;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int value = stack.pop();
            if (value != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
    
    int circular() {
        Node turtle = head;
        Node rabit = head;

        while (turtle.next != null || rabit.next.next != null) {
            turtle = turtle.next;
            rabit = rabit.next.next;
            if (turtle.data == rabit.data) return turtle.data;
        }
        return 0;
    }

    boolean intersection(LinkedList l2) {
        HashMap hashMap = new HashMap ();
        Node current = head;
        while (current != null) {
            hashMap.put(current.hashCode(), current.data);
            current = current.next;
        }
        Node checked = l2.head;
        while (checked != null) {
            if (hashMap.containsKey(checked.hashCode())) return true;
            checked = checked.next;
        }
        return false;
    }

}
