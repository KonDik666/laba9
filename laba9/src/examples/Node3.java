package examples;

public class Node3 {

    static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >=0 ; i--) {
            head = new Node(i, head);
            //System.out.println(head.value);

        }
        Node ref =  head;
        while (ref.next != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }




    }

}
