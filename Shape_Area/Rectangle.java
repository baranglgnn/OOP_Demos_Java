package Shape_Area;

public class Rectangle extends Shape {
  private int length;
  private int width;
  
  public Rectangle() {}
  
  public Rectangle(int lenght,int width) {
	  this.length=lenght;
	  this.width=width;
  }
  
  @Override
  public int calculateArea() {
	  int area= length*width;
	  return area;
  }
  

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}
  
	
}
