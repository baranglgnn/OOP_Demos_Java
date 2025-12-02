package Shape_Area;

public class Triangle extends Shape{
 private int base;
 private int height;
 
	public Triangle() {}
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
	
	@Override
	public int calculateArea() {
		int area = (base*height)/2;
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
