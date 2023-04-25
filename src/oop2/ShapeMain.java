package oop2;

public class ShapeMain {
    public static void main(String[] args) {
        var triangle = new Triangle(10, 15);
        var rectangle = new Rectangle(10, 15);

        var result = triangle.calculateArea();
        var result2 = rectangle.calculateArea();

        System.out.println(result);
        System.out.println(result2);
    }
}
