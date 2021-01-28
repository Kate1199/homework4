package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle square = new Rectangle(5, 5);
        Rectangle rec1 = new Rectangle(3, 8);
        Rectangle rec2 = new Rectangle(3, 8);

        square.calculateArea();
        rec1.calculateArea();
        rec2.calculateArea();

        square.printArea();
        rec1.printArea();
        rec2.printArea();

        System.out.println();
        System.out.println();

        square.printRectangleKind();
        rec1.printRectangleKind();
        rec2.printRectangleKind();

        System.out.println();
        System.out.println();

        System.out.println(square.isTheSameRectangle(rec1));
        System.out.println(rec1.isTheSameRectangle(rec2));
        System.out.println(rec2.isTheSameRectangle(square));
    }
}
