package tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeTest {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("ArrayList удаление в милисекундах = " + testRemove(arrayList));
        System.out.println("LinkedList удаление в милисекундах = " + testRemove(linkedList));
    }

    private static long testRemove(List<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

}
