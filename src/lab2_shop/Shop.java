package lab2_shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    // Метод добавления компьютера
    public void addComputer(Computer computer) {
        if (computer != null) {
            computers.add(computer);
            System.out.println("Компьютер добавлен: " + computer);
        } else {
            System.out.println("Ошибка: нельзя добавить null компьютер.");
        }
    }

    // Метод удаления компьютера по индексу
    public boolean removeComputerByIndex(int index) {
        if (index >= 0 && index < computers.size()) {
            Computer removed = computers.remove(index);
            System.out.println("Компьютер удален: " + removed);
            return true;
        } else {
            System.out.println("Ошибка: неверный индекс " + index + " для удаления.");
            return false;
        }
    }

    // Метод удаления конкретного объекта компьютера
    public boolean removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер удален: " + computer);
            return true;
        } else {
            System.out.println("Ошибка: компьютер не найден в магазине для удаления.");
            return false;
        }
    }

    // Метод поиска компьютеров по критериям
    public List<Computer> findComputers(String brand, String model, double maxPrice, String cpu, int minRam, int minStorage) {
        List<Computer> found = new ArrayList<>();
        for (Computer comp : computers) {
            if ((brand == null || brand.isEmpty() || comp.getBrand().equalsIgnoreCase(brand)) &&
                    (model == null || model.isEmpty() || comp.getModel().equalsIgnoreCase(model)) &&
                    (maxPrice < 0 || comp.getPrice() <= maxPrice) &&
                    (cpu == null || cpu.isEmpty() || comp.getCpu().equalsIgnoreCase(cpu)) &&
                    (minRam < 0 || comp.getRam() >= minRam) &&
                    (minStorage < 0 || comp.getStorage() >= minStorage)) {
                found.add(comp);
            }
        }
        return found;
    }

    // Метод получения всех компьютеров
    public List<Computer> getAllComputers() {
        return new ArrayList<>(computers); // возвращаем копию для безопасности
    }

    // Метод вывода всех компьютеров
    public void printAllComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
        } else {
            System.out.println("Компьютеры в магазине:");
            for (int i = 0; i < computers.size(); i++) {
                System.out.println(i + ": " + computers.get(i));
            }
        }
    }
}