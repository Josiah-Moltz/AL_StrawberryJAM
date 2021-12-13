import java.util.ArrayList;

public class OrderedArrayList {
  public ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer>();
  }

  public boolean add(int i) {
    int index = 0;
    while (index < size() && i > get(index)) {
      index += 1;
    }
    _data.add(index, i);
    return true;
  }

  public int remove(int index) {
    return _data.remove(index);
  }

  public int get(int index) {
    return _data.get(index);
  }

  public int size() {
    return _data.size();
  }

  public String toString() {
    return _data.toString();
  }
}
