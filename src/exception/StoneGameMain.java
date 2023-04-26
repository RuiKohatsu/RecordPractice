package exception;

public class StoneGameMain {
    public static void main(String[] args) {
        System.out.println("""
                ------------------------------
                石取りゲームを開始します。""");
        var stone = 0;
        var getLimit = 0;
        String[] member = StoneGame.nameInput();
        var symbol = StoneGame.symbolInit();
        var turn = 0;

        while(true) {
            try {
                stone = StoneGame.stoneInit();
                getLimit = StoneGame.getLimit();
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("数値を入力してください");
            }
        }

        System.out.println("------------------------------");

        System.out.println("残り："+ stone + "個");
        for(var i = 0; i < stone; i++){
            System.out.print(symbol);
        }
        System.out.println("");
        System.out.println("------------------------------");


        while(true){
            while(true) {
                try {
                    stone = StoneGame.stoneGet(member, stone, turn, getLimit);
                    break;
                }catch (NumberFormatException e){
                    e.printStackTrace();
                    System.out.println("数値を入力してください");
                }
            }

            if(stone <= 0){
                if(turn == 0){
                    System.out.println("勝者："+ member[member.length - 1]);
                    System.out.println("敗者："+ member[0]);
                }else {
                    System.out.println("勝者：" + member[turn - 1]);
                    System.out.println("敗者："+ member[turn]);
                }
                break;
            }
            System.out.println("残り：" + stone + "個");

            for(var i = 0; i < stone; i++){
                System.out.print(symbol);
            }
            System.out.println("");
            System.out.println("------------------------------");

            if(turn == member.length-1){
                turn = 0;
            }else{
                turn += 1;
            }
        }
    }
}
