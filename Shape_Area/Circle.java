package Shape_Area;

public class Circle extends Shape {
   private int radius;
   private int pi=3;
   
  public Circle() {}
  
  public Circle(int radius) {
	  this.radius=radius;
  }
  
  @Override
  public int calculateArea() {
	  int area= pi*(radius*radius);
	  return area;
  }
  
public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public int getPi() {
	return pi;
}

}
