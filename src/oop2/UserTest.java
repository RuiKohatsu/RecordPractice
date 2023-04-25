package oop2;

public class UserTest {
    public static void main(String[] args) {
        var user = new User("山田太郎", "沖縄県", "2000/01/01");
        var user2 = new User("山田太郎", "沖縄県", "2000/01/01");
        var user3 = new User("山田次郎", "宮城県", "2005/01/01");


        System.out.println(user2);

        var bool = user.equals(user2);
        var bool2 = user.equals(user3);
        System.out.println(bool);
        System.out.println(bool2);

    }
}
