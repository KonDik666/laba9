package tasks;

import java.util.ArrayList;

public class task7 {
    public static void main(String[] args) {

        int N = 10;

        ArrayList<Integer> list = new ArrayList<>();

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
