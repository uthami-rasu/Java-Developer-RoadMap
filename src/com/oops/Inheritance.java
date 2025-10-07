package com.oops;

class Father {
    String familyName;
    String house;
    boolean ownsCar;

    Father(String familyName, String house, boolean ownsCar) {
        this.familyName = familyName;
        this.house = house;
        this.ownsCar = ownsCar;
    }

    void work() {
        System.out.println("Father works in a company to provide for the family.");
    }

    @Override
    public String toString() {
        return "[Father: familyName=" + familyName +
                ", house=" + house +
                ", ownsCar=" + ownsCar + "]";
    }
}


class Son extends Father {
    String name;
    boolean studying;

    Son(String name, boolean studying, String familyName, String house, boolean ownsCar) {
        super(familyName, house, ownsCar); // call parent constructor
        this.name = name;
        this.studying = studying;
    }

    // Son overrides work() method
    @Override
    void work() {
        System.out.println(name + " is learning coding and helping his father sometimes.");
    }

    @Override
    public String toString() {
        return "[Son: name=" + name +
                ", studying=" + studying +
                ", familyName=" + familyName +
                ", house=" + house +
                ", ownsCar=" + ownsCar + "]";
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Father f = new Father("Sharma", "City Villa", true);
        Son s = new Son("Razz", true, "Sharma", "City Villa", true);

        System.out.println(f);
        f.work();

        System.out.println("\n" + s);
        s.work();
    }
}
