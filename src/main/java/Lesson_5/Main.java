package Lesson_5;

public class Main {
        public static void main(String[] args) {
            Product[] productsArray = new Product[5];
            
            productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
            productsArray[1] = new Product("iPhone 15 Pro", "10.09.2024", "Apple Inc.", "USA", 6999, false);
            productsArray[2] = new Product("Sony PlayStation 6", "05.12.2025", "Sony Corp.", "Japan", 4999, true);
            productsArray[3] = new Product("LG OLED TV", "15.07.2024", "LG Electronics", "Korea", 3499, false);
            productsArray[4] = new Product("Xiaomi Vacuum Cleaner", "22.03.2025", "Xiaomi Corp.", "China", 1999, true);
            
            for (Product product : productsArray) {
                product.printInfo();
            }
        }
    }