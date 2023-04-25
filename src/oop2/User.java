package oop2;

public class User {
    String name;
    String address;
    String seinen;

    public User(String name, String address, String seinen){
        this.name = name;
        this.address = address;
        this.seinen = seinen;

    }

    @Override
    public String toString(){
        return "名前：" + name + " 出身地：" + address + " 生年月日：" + seinen;
    }

    @Override
    public boolean equals(Object o){
        var user = (User)o;
        if(user.name.equals(this.name) && user.address.equals(this.address) && user.seinen.equals(this.seinen)){
            return true;
        }else{
            return false;
        }

    }
}
