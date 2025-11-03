package lab2_shop;

import java.util.List;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        InputInterface input = new InputInterface();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Меню магазина ---");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер по индексу");
            System.out.println("3. Найти компьютеры");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выйти");
            System.out.print("Выберите действие (1-5): ");

            String choice = input.scanner.nextLine();

            switch (choice) {
                case "1":
                    Computer newComp = input.inputComputer();
                    shop.addComputer(newComp);
                    break;
                case "2":
                    shop.printAllComputers();
                    if (!shop.getAllComputers().isEmpty()) {
                        int indexToRemove = input.inputIndex("Введите индекс компьютера для удаления: ");
                        shop.removeComputerByIndex(indexToRemove);
                    }
                    break;
                case "3":
                    String[] criteria = input.inputSearchCriteria();
                    List<Computer> results = shop.findComputers(
                            criteria[0].isEmpty() ? null : criteria[0],
                            criteria[1].isEmpty() ? null : criteria[1],
                            Double.parseDouble(criteria[3]) < 0 ? -1 : Double.parseDouble(criteria[3]),
                            criteria[2].isEmpty() ? null : criteria[2],
                            Integer.parseInt(criteria[4]) < 0 ? -1 : Integer.parseInt(criteria[4]),
                            Integer.parseInt(criteria[5]) < 0 ? -1 : Integer.parseInt(criteria[5])
                    );
                    if (results.isEmpty()) {
                        System.out.println("Компьютеры по критериям не найдены.");
                    } else {
                        System.out.println("Найденные компьютеры:");
                        results.forEach(System.out::println);
                    }
                    break;
                case "4":
                    shop.printAllComputers();
                    break;
                case "5":
                    running = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, введите 1-5.");
            }
        }

        input.close();
    }
}