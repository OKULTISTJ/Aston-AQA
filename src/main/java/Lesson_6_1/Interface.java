package Lesson_6_1;

interface Shape {
    double getArea();
    default double getPerimeter() {
        return 0;
    }
    String getFillColor();
    String getBorderColor();
}
