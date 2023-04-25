package oop2;

public class Triangle implements Shape{
    int teihen;
    int takasa;

    public Triangle(int teihen, int takasa){
        this.teihen = teihen;
        this.takasa = takasa;

    }

    @Override
    public double calculateArea(){
        var num = (teihen * takasa)/2;
        return num;
    }
}
