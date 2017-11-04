package Stacks_and_Queues;

import java.util.Stack;

public class StackSort {
    private Stack<Integer> sorted = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    void push(int value) {
        if (sorted.isEmpty()) {
            sorted.push(value);
            return;
        }
        while (!sorted.isEmpty()) {
            if (sorted.peek() > value) {
                temp.push(sorted.pop());
            } else {
                break;
            }
        }
        sorted.push(value);
        while (!temp.isEmpty()) {
            sorted.push(temp.pop());
        }
        System.out.println(sorted);
    }

}
