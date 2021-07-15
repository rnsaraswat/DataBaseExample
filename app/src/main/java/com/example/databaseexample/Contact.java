package com.example.databaseexample;

public class Contact {
    // इसमे एक table Contact की डिटेल रहीगी
    private int id;
    private String name;
    private String phoneNumber;

    //  यहाँ इसके constractor बनाया जागेगा जो की ALT+INS से बनयेगे
    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //  यहाँ इसके और constractor बनाया जागेगा जो की ALT+INS से बनयेगे
    // जो की constractor ओवरलोडिंग भी कहलाती है
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // जो की constractor ओवरलोडिंग भी कहलाती है
    public Contact() {
    }

    //  यहाँ इसके gatter/setters बनाये जायेगे जो की ALT+INS से बनयेगे

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

