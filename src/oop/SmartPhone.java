package oop;

public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    String apps;

    public SmartPhone(String model, String os){
        this.model = model;
        this.os = os;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void displayMyAccount(){
        System.out.println("アカウント：" + this.account);
    }


    public void displayDeviceInfo(){
        System.out.println("モデル：" + this.model + "os：" + this.os);
    }

    public boolean addAddressBook(AddressBook addressBook){

    }



}
