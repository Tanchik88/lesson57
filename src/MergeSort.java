import java.util.ArrayList;
import java.util.List;

public class MergeSort {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>(List.of("c", "a", "e", "b", "d"));
    System.out.println(strings);
    strings = sort(strings);
    System.out.println(strings);
  }

