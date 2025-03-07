package Lesson_5;

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    class Attraction {
        private String attractionName;
        private String workHours;
        private double price;

        public Attraction(String attractionName, String workHours, double price) {
            this.attractionName = attractionName;
            this.workHours = workHours;
            this.price = price;
        }

        public void showAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workHours);
            System.out.println("Стоимость: " + price);
            System.out.println("-----------------------------");
        }
    }
}
