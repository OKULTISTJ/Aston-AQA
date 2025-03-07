package Lesson_6;

public class FoodBowl {
    private int food;

    public FoodBowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в ней " + food + " еды.");
        }
    }
}
