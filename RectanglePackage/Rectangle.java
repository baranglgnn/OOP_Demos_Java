package RectanglePackage;

public class Rectangle {
    private int width;
    private int heigh;

    public Rectangle() {}

    public Rectangle(int width, int heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public int area() {
        return width * heigh;
    }

    public int perimeter() {
        return 2 * (width + heigh);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
}
