package RectanglePackage;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(20, 10);
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(10, 50);
        Rectangle rectangle4 = new Rectangle(3, 5);

        System.out.println("Area of the 1st rectangle: " + rectangle1.area());
        System.out.println("Perimeter of the 1st rectangle: " + rectangle1.perimeter());

        System.out.println("Area of the 2nd rectangle: " + rectangle2.area());
        System.out.println("Perimeter of the 2nd rectangle: " + rectangle2.perimeter());

        System.out.println("Area of the 3rd rectangle: " + rectangle3.area());
        System.out.println("Perimeter of the 3rd rectangle: " + rectangle3.perimeter());

        System.out.println("Area of the 4th rectangle: " + rectangle4.area());
        System.out.println("Perimeter of the 4th rectangle: " + rectangle4.perimeter());
    }
}
