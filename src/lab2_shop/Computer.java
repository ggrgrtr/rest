package lab2_shop;

import java.util.Objects;

public class Computer {
    private String brand;
    private String model;
    private double price;
    private String cpu;
    private int ram;
    private int storage;

    public Computer(String brand, String model, double price, String cpu, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.price, price) == 0 &&
                ram == computer.ram &&
                storage == computer.storage &&
                Objects.equals(brand, computer.brand) &&
                Objects.equals(model, computer.model) &&
                Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, price, cpu, ram, storage);
    }
}