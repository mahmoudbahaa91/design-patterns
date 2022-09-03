package structural.bridge;

public class Test {

    public static void main(String[] args) {

        Square  square = new Square(new Green());
        System.out.println(square.draw());

    }

}
