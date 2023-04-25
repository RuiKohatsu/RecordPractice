package oop2;

public class Circle implements Shape{

    int hankei;

    public Circle(int hankei){
        this.hankei = hankei;
    }

    @Override
    public double calculateArea(){
        var num = hankei * hankei * 3.14;
        return num;
    }

}
