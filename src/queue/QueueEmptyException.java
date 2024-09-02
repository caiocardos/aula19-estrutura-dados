package queue;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(int size, int capacity){
        super(String.format("queue is Empty. Size: %d. Capacity: %d", size, capacity));
    }    
}
