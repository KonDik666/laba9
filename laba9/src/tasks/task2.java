package tasks;

public class task2 {

    public static void binary(int n){


      if (n/2 > 0){
          binary(n/2);

      }
      System.out.print(" " + n%2);

    }

    static void main(String[] args) {
        binary(5);
    }

}
