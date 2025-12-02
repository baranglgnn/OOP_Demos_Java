package Shape_Area;

public class ShapeMain {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(5,10);
		Shape triangle = new Triangle(3,7);
		Shape [] shapeArray= {circle,rectangle,triangle};
		printShape(shapeArray);
		
	}
	
	public static void printShape(Shape [] shapeArray) {
		for (Shape shape : shapeArray) {
			System.out.println(shape.calculateArea());
		}
	}

}
