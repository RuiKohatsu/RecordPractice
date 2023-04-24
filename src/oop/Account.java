package oop;

public class Account {
    String name;
    String tel;
    String email;
    String address;

    public Account(String name, String tel, String email, String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo(){
        var account = "名前："+ name + "電話番号："+ tel + "Eメール："+ email + "住所："+ address;
        return account;
    }
}
