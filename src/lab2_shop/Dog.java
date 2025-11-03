package lab2_shop;

public class Dog {
    // Поля класса
    private String name;
    private int age;

    // Конструктор
    public Dog(String name, int age) {
        this.name = name;
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        this.age = age;
    }

    // Геттер для клички
    public String getName() {
        return name;
    }

    // Сеттер для клички
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Сеттер для возраста
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        this.age = age;
    }

    // Метод для перевода возраста собаки в "человеческий" возраст (по правилу 7 лет)
    public int getHumanAge() {
        return age * 7;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + " (human age: " + getHumanAge() + ")}";
    }
}
