package oop2;

import oop2.Dice;

public class CheatDice extends Dice {

    @Override
    public int see(){
        var num = this.num;
        if(count == 0){
            num = 1;
            return num;
        }
        if(count%6 == 0){
            num = 6;

        }
        return num;
    }
}
