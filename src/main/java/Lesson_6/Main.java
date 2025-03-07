package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(150);
        dogBobik.swim(8);
        catMurzik.run(180);
        catMurzik.swim(5);

        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        // Создаем миску с едой
        FoodBowl bowl = new FoodBowl(10);
        System.out.println("В миске еды: " + bowl.getFood());

        // Коты пытаются поесть
        catMurzik.eat(bowl, 5);
        catBarsik.eat(bowl, 6);

        // Проверяем сытость
        System.out.println("Мурзик сыт? " + catMurzik.isFull());
        System.out.println("Барсик сыт? " + catBarsik.isFull());

        // Добавляем еды в миску
        bowl.addFood(10);
        catBarsik.eat(bowl, 6);
        System.out.println("Барсик сыт? " + catBarsik.isFull());
    }
}
