public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimeterCalculator() {
        return (width + height) * 2;
    }

    public double areaCalculator() {
        return width * height;
    }

    public double diagonalCalculator() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
