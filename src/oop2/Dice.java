package oop2;
import java.util.Random;

public class Dice {
    int count;
    int num;

    public int cast(){
        Random rand = new Random();
        this.num = rand.nextInt(1, 7);
        return num;
    }

    public int see(){
        var num = this.num;
        if(count == 0){
            return 1;

        }
        return num;
    }

}
