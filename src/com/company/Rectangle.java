package com.company;

public class Rectangle {
    double x;
    double y;

    private static int createdRectangles = 0;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    public double calculateArea() {
        return x * y;
    }

    public void printArea() {
        System.out.println(calculateArea());
    }

    public void printRectangleKind() {
        if (x == y)
            System.out.println("Это квадрат");
        else
            System.out.println("Это прямоугольник");
    }

    public boolean isTheSameRectangle(Rectangle rectangle) {
        return x == rectangle.x && y == rectangle.y;
    }

    //домашка №5
    public static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }

    private static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private static final String ENGLISH_CLASS_NAME = "Rectangle";

    public static void printClassName(boolean printRussian) {
        if (printRussian == true)
            System.out.println(RUSSIAN_CLASS_NAME);
        else
            System.out.println(ENGLISH_CLASS_NAME);
    }

}
