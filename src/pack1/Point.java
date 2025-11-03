package pack1;

import java.util.Arrays;

// 1. Класс Point, описывающий точку на плоскости
class Point {
    private double x=0.0;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // для получения расстояния до другой точки
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }

    // Переопределение equals() для корректного сравнения объектов
    @Override
    public boolean equals(Object obj) {
        //  Проверка на ссылочную идентичность (this == this)
        if (this == obj) return true;
        // 3 Проверка, является ли obj null OR совпадают ли классы объектов
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приведение типа: превращаем Object в Point
        Point point = (Point) obj;
        //  Сравнение значений полей
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    // Переопределение hashCode() (всегда нужно, если переопределяешь equals)
    // hashCode() - код типа int для идентификации объекта
    @Override
    public int hashCode() {
        // статический метод из класса java.util.Arrays, который вычисляет хеш-код для массива.
        // если x, y - одинаковые, то хэшкод тоже будет один и тот же
        return Arrays.hashCode(new double[]{x, y});
    }
}