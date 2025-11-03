package lab2_shop;

import java.util.Scanner;

public class InputInterface {
    public final Scanner scanner = new Scanner(System.in);

    public Computer inputComputer() {
        System.out.println("Введите данные для нового компьютера:");
        System.out.print("Бренд: ");
        String brand = scanner.nextLine();

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        System.out.print("Цена: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Процессор: ");
        String cpu = scanner.nextLine();

        System.out.print("ОЗУ (GB): ");
        int ram = scanner.nextInt();

        System.out.print("Накопитель (GB): ");
        int storage = scanner.nextInt();
        scanner.nextLine(); // consume newline

        return new Computer(brand, model, price, cpu, ram, storage);
    }

    public String[] inputSearchCriteria() {
        System.out.println("Введите критерии поиска (оставьте пустым, если не важно):");
        System.out.print("Бренд: ");
        String brand = scanner.nextLine();

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        System.out.print("Максимальная цена: ");
        String priceStr = scanner.nextLine();
        double maxPrice = -1;
        if (!priceStr.isEmpty()) {
            try {
                maxPrice = Double.parseDouble(priceStr);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат цены, будет проигнорирован.");
            }
        }

        System.out.print("Процессор: ");
        String cpu = scanner.nextLine();

        System.out.print("Минимальный объем ОЗУ (GB): ");
        String ramStr = scanner.nextLine();
        int minRam = -1;
        if (!ramStr.isEmpty()) {
            try {
                minRam = Integer.parseInt(ramStr);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ОЗУ, будет проигнорирован.");
            }
        }

        System.out.print("Минимальный объем накопителя (GB): ");
        String storageStr = scanner.nextLine();
        int minStorage = -1;
        if (!storageStr.isEmpty()) {
            try {
                minStorage = Integer.parseInt(storageStr);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат накопителя, будет проигнорирован.");
            }
        }

        return new String[]{brand, model, cpu, String.valueOf(maxPrice), String.valueOf(minRam), String.valueOf(minStorage)};
    }

    public int inputIndex(String message) {
        System.out.print(message);
        int index = -1;
        try {
            index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат индекса.");
        }
        return index;
    }

    public void close() {
        scanner.close();
    }
}