package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class ListPractice {
    public static void main(String[] args){
        System.out.println("名前を入力してください");
        List<String> list = new ArrayList<>();

        while(true){
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            if(s1.equals("exit")){
                System.out.println("\n");
                break;
            }else{
                list.add(s1);
            }
        }
        var len = list.size() - 1;
        System.out.println("最初に入力された人：" + list.get(0));
        System.out.println("最初に入力された人：" + list.get(len));
        System.out.println("名前で並べ替えます");
        Collections.sort(list);
        for(var i = 0; i <= len; i++){
            System.out.println(list.get(i));
        }
    }
}
