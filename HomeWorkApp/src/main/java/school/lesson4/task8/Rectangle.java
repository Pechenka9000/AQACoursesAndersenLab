package school.lesson4.task8;

public class Rectangle implements Shape {
    private double a;
    private double b;
    private String fillColor;
    private String borderColor;
    public Rectangle(double a, double b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double computeSquare() {
        return (getA() * getB());
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами: " +
                "a = " + a +
                ", b = " + b + "; \n" +
                "периметр = " + Shape.super.perimeter(Rectangle.this) +
                "; площадь = " + computeSquare() + "; \n" +
                "цвет заливки - " + fillColor + '\'' +
                "; цвет границы' - " + borderColor + '\'' + "\n";
    }
}