package tasks;

import java.util.LinkedList;

public class task7_v2 {

    public static void main(String[] args) {

        int N = 10;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.println("Начальный список: " + list);

        int index = 0;

        while (list.size() > 1) {

            index = (index + 1) % list.size();

            System.out.println("Удаляется: " + list.get(index));

            list.remove(index);

            System.out.println("Список сейчас: " + list);
            System.out.println("----------------");
        }

        System.out.println("Остался человек: " + list.get(0));
    }


}
