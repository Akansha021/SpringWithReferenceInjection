package org.example;

public class Person {
    int id;
    String name;
    Addresses addresses;

    public void getId() {
        System.out.println("id :"+id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAddresses() {
        addresses.getAddress();
//        System.out.println(addresses);
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }
}
