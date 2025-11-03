package lab2_shop;

import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    // Конструктор
    public DogKennel() {
        this.dogs = new ArrayList<>();
    }

    // Метод для добавления собаки в питомник
    public void addDog(Dog dog) {
        if (dog != null) {
            dogs.add(dog);
            System.out.println("Собака добавлена: " + dog);
        } else {
            System.out.println("Ошибка: нельзя добавить null собаку.");
        }
    }

    // Метод для получения списка всех собак
    public List<Dog> getAllDogs() {
        return new ArrayList<>(dogs); // возвращаем копию для безопасности
    }

    // Метод для вывода всех собак в питомнике
    public void printAllDogs() {
        if (dogs.isEmpty()) {
            System.out.println("Питомник пуст");
        } else {
            System.out.println("Собаки в питомнике:");
            for (int i = 0; i < dogs.size(); i++) {
                System.out.println((i + 1) + ". " + dogs.get(i));
            }
        }
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        // Создаем несколько объектов Dog
        Dog dog1 = new Dog("Бобик", 3);
        Dog dog2 = new Dog("Шарик", 5);
        Dog dog3 = new Dog("Рекс", 7);

        // Добавляем dogs в питомник
        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        // Выводим всех собак
        kennel.printAllDogs();

        // Тестируем аксессоры
        System.out.println("\nТестируем сеттеры:");
        dog1.setName("Мухтар");
        dog1.setAge(4);
        System.out.println("Обновленная информация о собаке 1: " + dog1);

        // Проверяем "человеческий" возраст
        System.out.println("\nЧеловеческий возраст для " + dog2.getName() + ": " + dog2.getHumanAge() + " лет.");
    }
}