public class Main {
    public static void main(String[] args) {
        double width = 4.19;
        double height = 5.82;
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle);
        System.out.printf("Perimeter = %.4f\n", rectangle.perimeterCalculator());
        System.out.printf("Area = %.4f\n", rectangle.areaCalculator());
        System.out.printf("Diagonal = %.4f\n", rectangle.diagonalCalculator());
    }
}