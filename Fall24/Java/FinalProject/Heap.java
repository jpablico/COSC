import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> {
    private final ArrayList<T> heap;
    private final Comparator<T> comparator;

    public Heap(Comparator<T> comparator) {
        this.comparator = comparator;
        this.heap = new ArrayList<>();
    }

    public void add(T element) {
      heap.add(element);
      int index = heap.size() - 1;

      while (index > 0) {
        int parentIndex = (index - 1) / 2;
        if (comparator.compare(heap.get(index), heap.get(parentIndex)) > 0) {
          T temp = heap.get(index);
          heap.set(index, heap.get(parentIndex));
          heap.set(parentIndex, temp);
          index = parentIndex;
        } else {
          break;
        }
      }
    }

    public T remove() {
      if (heap.isEmpty()) {
        return null;
      }
      T result = heap.get(0);
      T lastElement = heap.remove(heap.size() - 1);
      if (!heap.isEmpty()) {
        heap.set(0, lastElement);
        heapifyDown(0);
      }
      return result;
    }

    private void heapifyDown(int index) {
      int leftChildIndex;
      int rightChildIndex;
      int largestIndex;

      while (index < heap.size() / 2) {
        leftChildIndex = 2 * index + 1;
        rightChildIndex = 2 * index + 2;
        largestIndex = index;

        if (leftChildIndex < heap.size() && comparator.compare(heap.get(leftChildIndex), heap.get(largestIndex)) > 0) {
          largestIndex = leftChildIndex;
        }

        if (rightChildIndex < heap.size() && comparator.compare(heap.get(rightChildIndex), heap.get(largestIndex)) > 0) {
          largestIndex = rightChildIndex;
        }

        if (largestIndex == index) {
          break;
        }

        T temp = heap.get(index);
        heap.set(index, heap.get(largestIndex));
        heap.set(largestIndex, temp);
        index = largestIndex;
      }
    }
}