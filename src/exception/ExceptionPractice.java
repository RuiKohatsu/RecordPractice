package exception;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        while(true) {
            System.out.print("数値を入力してください：");
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();

            try {
                var score = Integer.parseInt(s1);
                var result = judgeScore(score);
                System.out.println(result);
                break;

            }catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("数値を入力してください");

            }catch (IlligalScoreException e) {
                e.printStackTrace();
                System.out.println("スコアが不正です");
            }
        }

    }
    public static String judgeScore(int score) throws IlligalScoreException{
        if(score > 100 || score < 0){
            throw new IlligalScoreException();
        }else if(score >= 80){
            return "A";
        }else if(score >= 70){
            return "B";
        }else if(score >= 60){
            return "C";
        }else if(score >= 0){
            return "D";
        }else {
            return "0";
        }
    }

//    scoreの値が80以上の場合は"A"を返す
//    scoreの値が70以上の場合は"B"を返す
//    scoreの値が60以上の場合は"C"を返す
//    scoreの値が59以下の場合は"D"を返す
//    scoreの値が負の値、または100より大きい場合はIlligalScoreExceptionの例外を投げる
}
