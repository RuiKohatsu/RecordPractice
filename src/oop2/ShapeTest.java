package oop2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        var triangle = new Triangle(10, 15);
        var rectangle = new Rectangle(10, 15);
        var circle = new Circle(10);


        shape[0] = triangle;
        shape[1] = rectangle;
        shape[2] = circle;

        var result = ShapeTest.getTotalArea(shape);
        System.out.println("sum：" + result);
    }

    public static double getTotalArea(Shape[] shapes){
         var num  = shapes[0].calculateArea();
         System.out.println("tri：" + num);
         var num2 = shapes[1].calculateArea();
         System.out.println("rec：" + num2);
         var num3 = shapes[2].calculateArea();
         System.out.println("cir：" + num3);

         var result = num + num2 + num3;
         return result;
    }
}

