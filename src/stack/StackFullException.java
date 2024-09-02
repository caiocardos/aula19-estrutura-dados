package stack;

public class StackFullException extends Exception {
    public StackFullException (int size, int capacity){
        super(String.format("stack is Full Size: %d. Capacity: %d", size, capacity));
    }    
}
