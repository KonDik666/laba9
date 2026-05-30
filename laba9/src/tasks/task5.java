package tasks;

import examples.Node;

public class task5 {

    //Код с "Головы" уже представлен в примере (в папке examples, Node3). В данной программе будет реализация с "хвоста"

    static void main(String[] args) {
        Node head = new Node(0, null); // первый элемент
        Node tail = head;

        for (int i = 1; i < 10; i++) {
            tail.next = new Node(i, null);
            tail = tail.next;
        }

        Node ref = head;

        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
