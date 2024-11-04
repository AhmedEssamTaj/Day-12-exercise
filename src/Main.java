/*
Author: Ahmed Essam Taj
Date: 4, November
Day 12 - Exercise...

 */
public class Main {
    public static void main(String[] args) {


        // Testing the Shape class
        Shape s = new Shape();
        System.out.println(s.toString());
        System.out.println("======================================");


        // Testing the Circle class
        Circle c = new Circle(3.5);

        System.out.println(c.toString());

        System.out.println("Circle Area is: "+c.getArea());
        System.out.println("Circle Perimeter is: "+c.getPerimeter());
        System.out.println("======================================");


        // Testing the Rectangle Class
        Rectangle r = new Rectangle(5,8);
        System.out.println(r.toString());
        System.out.println("The Area for the Rectangle is: "+r.getArea());
        System.out.println("The Perimeter of the rectangle is: "+r.getPerimeter());
        System.out.println("======================================");

        // Testing the square class
        Square sq = new Square(5);
        System.out.println(sq.toString());
        System.out.println("The area for the square is: "+sq.getArea());
        System.out.println("The Perimeter of the square is: "+sq.getPerimeter());
    }
}