package Lesson_6;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false; // Сытость кота

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(FoodBowl bowl, int foodAmount) {
        if (foodAmount > 0 && bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть. В миске недостаточно еды.");
        }
    }
}
