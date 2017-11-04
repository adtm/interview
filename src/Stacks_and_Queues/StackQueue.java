package Stacks_and_Queues;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> enqueue = new Stack<>();
    private Stack<Integer> dequeue = new Stack<>();

    void enqueue(Integer value) {
        enqueue.push(value);
    }

    Integer dequeue() {
        if (dequeue.isEmpty()) {
            while (!enqueue.isEmpty()) {
                dequeue.push(enqueue.pop());
            }
        }
        return dequeue.pop();
    }

}
