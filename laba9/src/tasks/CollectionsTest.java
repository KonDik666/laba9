package tasks;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 0; i < 5000000; i++) {
            arrayList.add(i);
            arrayDeque.add(i);
            sortedSet.add(i);
        }

        System.out.println("ArrayList в милисекундах = " + testArrayList(arrayList));
        System.out.println("ArrayDeque в милисекундах = " + testArrayDeque(arrayDeque));
        System.out.println("SortedSet в милисекундах = " + testSortedSet(sortedSet));
    }

    static long testArrayList(ArrayList<Integer> list) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    static long testArrayDeque(ArrayDeque<Integer> deque) {

        long start = System.currentTimeMillis();

        for (Integer x : deque) {}

        long end = System.currentTimeMillis();

        return end - start;
    }

    static long testSortedSet(SortedSet<Integer> set) {

        long start = System.currentTimeMillis();

        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            i.next();
        }

        long end = System.currentTimeMillis();

        return end - start;
    }
}

