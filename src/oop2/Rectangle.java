package oop2;

public class Rectangle implements Shape {
    int tate;
    int yoko;

    public Rectangle(int tate, int yoko){
        this.tate = tate;
        this.yoko = yoko;
    }

    @Override
    public double calculateArea(){
        var num = tate * yoko;
        return num;
    }
}
