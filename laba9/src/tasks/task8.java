package tasks;

import examples.Node;

public class task8 {
    public static Node head;


    public static void createHead(){
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
            //System.out.println(head.value);
        }
    }

    public static void createTail(){

        head = new Node(0, null);

        Node tail = head;

        for(int i = 1; i < 10; i++){

            tail.next = new Node(i, null);
            tail = tail.next;
            //System.out.println(tail.value);
        }

    }

    @Override
    public String toString(){

        String result = "";

        Node ref = head;

        while (ref != null) {
            result += ref.value + " ";
            ref = ref.next;
        }

        return result;
    }


    public void AddFirst(int value) {

        head = new Node(value, head);
    }

    public void AddLast(int value) {

        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node ref = head;

        while (ref.next != null) {
            ref = ref.next;
        }

        ref.next = newNode;
    }


    public void Insert(int index, int value) {
        if(index == 0){  //если индекс 0, вызывается метод добавления первого элемента
            AddFirst(value);
            return;
        }

        Node newNode = new Node(value, null);
        Node ref = head;

        int k = 0;
        while (ref != null && k < index - 1) {

            ref = ref.next;
            k++;
        }

        newNode.next = ref.next;

        ref.next = newNode;
    }


    public void RemoveFirst() {

        if (head != null) {
            head = head.next;
        }
    }

    public void RemoveLast() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node ref = head;

        while (ref.next.next != null) {

            ref = ref.next;
        }

        ref.next = null;
    }

    public void Remove(int index) {

        if (index == 0) {
            RemoveFirst();
            return;
        }

        Node ref = head;

        int k = 0;

        while (ref.next != null && k < index - 1) {

            ref = ref.next;
            k++;
        }

        ref.next = ref.next.next;
    }

    public void createHeadRec(int n) {

        if (n == 0) {
            return;
        }

        head = new Node(n, head);

        createHeadRec(n - 1);
    }

    public void createTailRec(int n) {

        if (n == 0) {
            return;
        }

        createTailRec(n - 1);

        AddLast(n);
    }

    private String toStringRec(Node ref) {

        if (ref == null) {
            return "";
        }

        return ref.value + " " + toStringRec(ref.next);
    }

    static void main(String[] args) {

        task8 list = new task8();

        list.createHead();
        System.out.println("createHead:");
        System.out.println(list.toString());

        list.AddFirst(100);
        System.out.println("AddFirst(100):");
        System.out.println(list.toString());

        list.AddLast(200);
        System.out.println("AddLast(200):");
        System.out.println(list.toString());

        list.Insert(2, 999);
        System.out.println("Insert(2, 999):");
        System.out.println(list.toString());

        list.RemoveFirst();
        System.out.println("RemoveFirst:");
        System.out.println(list.toString());

        list.RemoveLast();
        System.out.println("RemoveLast:");
        System.out.println(list.toString());

        System.out.println(list.toStringRec(head));

    }


}
