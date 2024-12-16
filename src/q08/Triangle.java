package q08;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public int Perimeter() {
        return side1+side2+side3;
    }
    public double Area() {
        return (side1*(double)side2)/2;
    }
}
