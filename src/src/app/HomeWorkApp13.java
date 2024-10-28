package src.src.app;

public class HomeWorkApp13 {
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(3, 4),
                new Square(6)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", totalArea);
    }
}
