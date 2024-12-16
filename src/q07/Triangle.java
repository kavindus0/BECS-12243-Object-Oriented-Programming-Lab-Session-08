package q07;

public class Triangle {
    private int side1 = 3;
    private int side2 = 4;
    private int side3 = 5;

    public int Perimeter() {
        return side1+side2+side3;
    }
    public double Area() {
        return (side1*(double)side2)/2;
    }
}
