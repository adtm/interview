package Stacks_and_Queues;

import java.util.Stack;

public class StackMin extends Stack<Integer> {

    private Stack<Integer> stackMinimumValue = new Stack<Integer>();

    @Override
    public Integer push(Integer item) {
        if (stackMinimumValue.isEmpty()) {
            stackMinimumValue.push(item);
        } else if (stackMinimumValue.peek() > item) {
            stackMinimumValue.push(item);
        }
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        if (super.peek().equals(stackMinimumValue.peek())) {
            stackMinimumValue.pop();
        }
        return super.pop();
    }
}
