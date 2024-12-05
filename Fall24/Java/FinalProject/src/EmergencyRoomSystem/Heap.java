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

  }

  @Override
  public T remove() {
    return null;
  }
}