package Stacks_and_Queues;


import java.util.Stack;

public class StackWithMinNode extends Stack<NodeWithMin> {
    public void push(int item) {
        int newMin = Math.min(item, min());
        super.push(new NodeWithMin(item, newMin));
    }

    int min() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return this.peek().min;
        }
    }
}
