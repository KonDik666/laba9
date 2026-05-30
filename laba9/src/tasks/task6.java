package tasks;

import java.util.HashMap;
import java.util.Map;

public class task6 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "0й объект");
        map.put(1, "1й объект");
        map.put(2, "2й объект");
        map.put(3, "3й объект");
        map.put(4, "4й объект");
        map.put(5, "5й объект");
        map.put(6, "6й объект");
        map.put(7, "7й объект");
        map.put(8, "8й объект");
        map.put(9, "9й объект");

        int product = 1;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            if (entry.getKey() > 5) {
                System.out.println("Ключ > 5: " + entry.getValue());
            }

            if (entry.getKey() == 0) {
                System.out.println("Ключ = 0: " + entry.getValue());
            }

            if (entry.getValue().length() > 5) {
                product = product * entry.getKey();
            }
        }

        System.out.println("Произведение ключей: " + product);
    }
}
