package Lesson_5;

public class Product {
    private String name;
    private String manufactureDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isBooked;

    public Product(String name, String manufactureDate, String manufacturer, String country, double price, boolean isBooked) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + manufactureDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
        System.out.println("-----------------------------");
    }
}
