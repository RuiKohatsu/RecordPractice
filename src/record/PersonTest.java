package record;

public class PersonTest {
    public static void main(String[] args) {

        Person[] persons = {
                new Person("山田　一郎", "ヤマダ　イチロウ", 25),
                new Person("山田　次郎", "ヤマダ　ジロウ", 23),
                new Person("山田　三郎", "ヤマダ　サブロウ", 21),
                new Person("山田　四郎", "ヤマダ　シロウ", 18),
                new Person("山田　五郎", "ヤマダ　ゴロウ", 16)
        };

        var min = persons[0].age();
        var minPerson = persons[0].name();

        var max = persons[0].age();
        var maxPerson = persons[0].name();

        var len = persons.length;

        for(var i = 0; i < len - 1; i ++){
            if(min > persons[i + 1].age()){
                min = persons[i + 1].age();
                minPerson = persons[i + 1].name();
            }
        }
        for(var j = 0; j < len - 1; j++){
            if(max < persons[j + 1].age()){
                max = persons[j + 1].age();
                maxPerson = persons[j + 1].name();
            }
        }
        System.out.println("最年少：" + minPerson);
        System.out.println("最年長：" + maxPerson);
    }
}
