import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer>integers=List.of(1, 2, 3, 4, 5);
    private static int k=9;
    public static void main(String[] args) {
        List<Integer> lists = lists(integers, k);
        System.out.println(lists);
    }

    private static List<Integer> lists(List<Integer> list, int k) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < list.size() - 2; i++) {
            int sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
            if (sum == k) {
                integers.add(list.get(i));
                integers.add(list.get(i + 1));
                integers.add(list.get(i + 2));

            }

        }
        return integers;
    }
}