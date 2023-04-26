package oop;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook("コハツ", "000-0000-0001", "aaa@gmail.com");
        AddressBook addressBook2 = new AddressBook("ヤマダ", "000-0000-0002", "bbb@gmail.com");
        AddressBook addressBook3 = new AddressBook("アツミ", "000-0000-0003", "ccc@gmail.com");
        AddressBook addressBook4 = new AddressBook("モリ", "000-0000-0004", "ddd@gmail.com");
        AddressBook addressBook5 = new AddressBook("イシカワ", "000-0000-0005", "eee@gmail.com");
        AddressBook addressBook6 = new AddressBook("カワグチ", "000-0000-0006", "fff@gmail.com");

        SmartPhone smartPhone = new SmartPhone("iphone 13", "ios");

        Account account = new Account("琉球太郎", "000-0000-0000", "abc@gmail.com", "沖縄県");

        AddressBook[] addressBooks = new AddressBook[5];

        smartPhone.displayDeviceInfo();

        smartPhone.setAccount(account);

        System.out.println(account.getAccountInfo());

        smartPhone.displayMyAccount();

        boolean bool = smartPhone.addAddressBook(addressBooks, addressBook);
        System.out.println(bool);
        boolean bool2 = smartPhone.addAddressBook(addressBooks, addressBook2);
        System.out.println(bool2);
        boolean bool3 = smartPhone.addAddressBook(addressBooks, addressBook3);
        System.out.println(bool3);
        boolean bool4 = smartPhone.addAddressBook(addressBooks, addressBook4);
        System.out.println(bool4);
        boolean bool5 = smartPhone.addAddressBook(addressBooks, addressBook5);
        System.out.println(bool5);
        boolean bool6 = smartPhone.addAddressBook(addressBooks, addressBook6);
        System.out.println(bool6);


    }
}
