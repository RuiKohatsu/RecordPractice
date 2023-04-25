package oop2;

public class CheatDiceTest {
    public static void main(String[] args) {
        var dice = new CheatDice();
        dice.count = 0;

        for(var i = 1; i < 31; i++) {
            var num = dice.cast();
            System.out.println("cast："+num);
            dice.count += 1;
            System.out.println(dice.count + "回目");
            num = dice.see();
            System.out.println("see：" + num);
            System.out.println("------------");

        }
    }
}