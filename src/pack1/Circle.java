package pack1;
import java.util.Arrays;

class Circle {
    private Point center;
    private double radius;

    // Конструктор
    public Circle(Point center, double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным.");
        }
        this.center = center;
        this.radius = radius;
    }

    // Геттеры
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    // Сеттеры (опционально)
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным.");
        }
        this.radius = radius;
    }

    // Метод для получения площади окружности
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Метод для получения длины окружности
    public double getPerimeter() { // или getCircumference()
        return 2 * Math.PI * radius;
    }

    // Метод проверяет, содержит ли окружность заданную точку
    public boolean contains(Point point) {
        return center.distanceTo(point) <= radius;
    }

    // Переопределение toString() для удобного вывода
    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }

    // Переопределение equals() для корректного сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0 && center.equals(circle.center);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{center, radius});
    }
}
