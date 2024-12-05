package EmergencyRoomSystem;

public interface PriorityQueue<T> {
    void add(T element);
    T remove();
    boolean isEmpty();
}