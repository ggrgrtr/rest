package pack1;

class Tester {
    private Circle[] circles; // Массив объектов Circle
    private int count; // Количество эл. в массиве

    // Конструктор, инициализирует массив заданного размера
    public Tester(int size) {
        if (size <= 0) {
            // ERRor
            throw new IllegalArgumentException("Размер массива должен быть положительным.");
        }
        // создание массива circ;e
        this.circles = new Circle[size];
        this.count = 0;
    }

    // Метод для добавления окружности в массив
    public boolean addCircle(Circle circle) {
        if (count >= circles.length) {
            System.out.println("Массив заполнен. Невозможно добавить новую окружность.");
            return false; // Не удалось добавить
        }
        circles[count] = circle;
        count++;
        return true; // Успешно добавлено
    }

    // Метод для получения окружности по индексу
    public Circle getCircle(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Неверный индекс: " + index);
            return null;
        }
        return circles[index];
    }

    // Метод для получения текущего количества окружностей
    public int getCount() {
        return count;
    }

    // Метод для получения максимального размера массива
    public int getCapacity() {
        return circles.length;
    }

    // Метод для печати всех окружностей в массиве
    public void printCircles() {
        System.out.println("Количество окружностей: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("  " + circles[i]);
        }
    }



    // TEST ----------------------------------------------


    public static void main(String[] args) {
        // Создаем Tester с массивом на 3 окружности
        Tester tester = new Tester(3);

        // Создаем точки и окружности
        Point center1 = new Point(0, 0);
        Circle circle1 = new Circle(center1, 5.0);

        Point center2 = new Point(3, 4);
        Circle circle2 = new Circle(center2, 2.5);

        Point center3 = new Point(-1, -1);
        Circle circle3 = new Circle(center3, 10.0);

        // Добавляем окружности в массив
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.addCircle(circle3);

        // Пытаемся добавить еще одну - не должно получиться
        Circle circle4 = new Circle(new Point(100, 100), 1.0);
        tester.addCircle(circle4);

        // Выводим все окружности
        tester.printCircles();

        // Получаем и выводим конкретную окружность
        System.out.println("\nПервая окружность: " + tester.getCircle(0));

        // Проверяем, содержит ли первая окружность центр второй
        System.out.println("\nСодержит ли circle1 центр circle2? " + circle1.contains(center2));

        // Выводим площадь и периметр одной из окружностей
        System.out.println("\nПлощадь circle2: " + circle2.getArea());
        System.out.println("Периметр circle2: " + circle2.getPerimeter());
    }
}