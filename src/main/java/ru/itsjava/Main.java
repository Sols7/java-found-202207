package ru.itsjava;

import ru.itsjava.oop.Iphone;
import ru.itsjava.oop.Telephone;

public class Main {
    public static void main(String[] args) {
        Telephone phone = new Iphone();

        System.out.println("phone.toString() = " + phone.toString());
    }
}
