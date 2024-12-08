import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> implements PriorityQueue<T> {
  private ArrayList<T> heap;
  private Comparator<T> comparator;


  public Heap(Comparator<T> comparator) {
    this.heap = new ArrayList<>();
    this.comparator = comparator;
  }

  @Override
  public void add(T element) {
    heap.add(element);
    int index = heap.size() - 1;

    while (index > 0) {
      int parentIndex = (index - 1) / 2;
      if (comparator.compare(heap.get(index), heap.get(parentIndex)) >= 0) {
        break;
      }
      swap(index, parentIndex);
      index = parentIndex;
    }
  }

  @Override
  public T remove() {
    if (heap.isEmpty()) {
      return null;
    }

    T root = heap.get(0);
    T lastElement = heap.remove(heap.size() - 1);

    if (!heap.isEmpty()) {
      heap.set(0, lastElement);
      int index = 0;

      while(true) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestChildIndex = leftChildIndex;

        if (leftChildIndex >= heap.size()) {
          break;
        }

        if (rightChildIndex < heap.size() && comparator.compare(heap.get(leftChildIndex), heap.get(rightChildIndex)) > 0) {
          smallestChildIndex = rightChildIndex;
        }

        if (comparator.compare(heap.get(index), heap.get(smallestChildIndex)) <= 0) {
          break;
        }

        swap(index, smallestChildIndex);
        index = smallestChildIndex;
      }
    }
    return root;
  }

  @Override
  public boolean isEmpty() {
    return heap.isEmpty();
  }

  private void swap(int index1, int index2) {
    T temp = heap.get(index1);
    heap.set(index1, heap.get(index2));
    heap.set(index2, temp);
  }
}