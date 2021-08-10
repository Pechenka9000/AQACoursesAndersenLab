package school.lesson4.task8;

public interface Shape {
    double computeSquare();

    default double perimeter (Rectangle rectangle) {
        return (rectangle.getA()+rectangle.getB())*2;
    }

    default double perimeter (Triangle triangle) {
        return (triangle.getA()+triangle.getB()+triangle.getC());
    }

    default double perimeter (Circle circle) {
        return (Math.PI * 2 * circle.getR());
    }
}
