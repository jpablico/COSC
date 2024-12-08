import java.util.Comparator;
import java.util.Random;

public class HeapDemo {
    public static void main(String[] args) {
        Random rdm = new Random();
        Comparator<Integer> comparator = Integer::compare;
        Heap<Integer> heap = new Heap<>(comparator);

        System.out.println("\nAdding elements to the heap:");
        for (int i = 0; i < 20; i++) {
            int number = rdm.nextInt(100); 
            System.out.print(number + " ");
            heap.add(number);
        }

        System.out.println("\n\nRemoving elements from the heap in ascending order:");
        while (!heap.isEmpty()) {
            System.out.print(heap.remove() + " ");
        }
    }
}