package oop;
import oop2.User;

import java.util.Arrays;
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
        System.out.println(this.account);
    }


    public void displayDeviceInfo(){
        System.out.println("モデル：" + this.model + " os：" + this.os);
    }

    public boolean addAddressBook(AddressBook[] addressBooks, AddressBook addressBook){
        var i = 0;
        var bool = true;



//        addressBooks[0] = addressBook;
//        System.out.println(addressBooks[0].name);

        while (true){
            if(i < 5) {
                if (addressBooks[i] == null) {
                    addressBooks[i] = addressBook;
                    this.addressBooks = addressBooks;
                    bool = true;
                    System.out.println(Arrays.toString(this.addressBooks));
                    return bool;
                } else {
                    i++;
                }
            }else{
                bool = false;
                break;
            }
        }
      return bool;
    }
}
