package examples;

public class Recursion {

    public static void m(int x){
        System.out.println("x= " + x);
        if((2 * x +1) < 20){
            m(2 * x + 1);
        }
    }


    static void main(String[] args) {
        m(1);
    }


}
