package queue;

public class QueueFullException extends Exception {
    public QueueFullException (int size, int capacity){
        super(String.format("queue is Full Size: %d. Capacity: %d", size, capacity));
    }    
}
