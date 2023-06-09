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

