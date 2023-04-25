package oop2;

public class DiceTest {
    public static void main(String[] args) {
        var dice = new Dice();
        dice.count = 0;

        for(var i = 1; i < 31; i++) {
            var num = dice.cast();
            dice.count += 1;
            num = dice.see();
            System.out.println(num);

        }
    }
}
