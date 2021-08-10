package school.lesson4.task8;

public class Circle implements Shape{
    private double radius;
    private String fillColor;
    private String borderColor;
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getR() {
        return radius;
    }

    @Override
    public double computeSquare() {
        return Math.PI * (getR() * getR());
    }

    @Override
    public String toString() {
        return "Круг радиусом " +
                "r = " + getR() + "; \n" +
                "длина окружности = " + Shape.super.perimeter(Circle.this) +
                "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + fillColor + '\'' +
                "; цвет границы' - " + borderColor + '\'' + "\n";
    }
}
