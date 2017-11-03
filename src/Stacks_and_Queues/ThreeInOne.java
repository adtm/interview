package Stacks_and_Queues;

public class ThreeInOne {

    private int stackAmount = 3;
    private int stackSize = 5;
    public int[] stackArray = new int[stackSize * stackAmount];
    public int[] stackPointers = { 0, 0, 0 };
    
    public ThreeInOne() {

    }

    void push(int value, int stackNumber) {
        if (stackPointers[stackNumber] >= stackSize) {
            System.out.println("Array is over it's limits.");
            return;
        }

        int index = stackPointers[stackNumber]++;
        stackArray[index + stackNumber * stackSize] = value;
    }

    void pop(int stackNumber) {
        if (stackPointers[stackNumber] == 0) {
            System.out.println("Cannot pop, array is empty");
            return;
        }
        stackArray[--stackPointers[stackNumber]] = 0;
    }

}
