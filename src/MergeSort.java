import java.util.ArrayList;
import java.util.List;

public class MergeSort {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>(List.of("c", "a", "e", "b", "d"));
    System.out.println(strings);
    strings = sort(strings);
    System.out.println(strings);
  }
  public static List<String> sort(List<String> strings) {
    if (strings.size() < 2) {
      return strings;
    }
    int mid = strings.size() / 2;
    List<String> left = strings.subList(0, mid);
    List<String> right = strings.subList(mid, strings.size());

    left = sort(left);
    right = sort(right);
    return merge(left, right);
  }
  private static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>(list1.size() + list2.size());
    int i1 = 0;
    int i2 = 0;

    while (i1 < list1.size() || i2 < list2.size()) {
      if (i1 < list1.size() && i2 < list2.size()) {
        if (list1.get(i1).compareTo(list2.get(i2)) <= 0) {
          result.add(list1.get(i1));
          ++i1;
        } else {
          result.add(list2.get(i2));
          ++i2;
        }
      } else if (i1 < list1.size()) {
        result.add(list1.get(i1));
        ++i1;
      } else {
        result.add(list2.get(i2));
        ++i2;
      }
    }

    return result;
  }
}

