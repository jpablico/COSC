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
    
  }

  private void swap(int index1, int index2) {
    T temp = heap.get(index1);
    heap.set(index1, heap.get(index2));
    heap.set(index2, temp);
  }
}