package Stacks_and_Queues;

import java.util.ArrayList;
import java.util.Stack;

public class StackWithSets{

    int limit = 3;
    ArrayList<Stack> arrayList = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    void push (int value) {
        stack.push(value);
        if (stack.size() == limit) {
           arrayList.add(stack);
           stack = new Stack<>();
        }
    }

    Stack pop() {
        return arrayList.get(arrayList.size());
    }

    Object popAt(int index) {
        return arrayList.get(index).pop();
    }

}
