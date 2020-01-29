package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Bob";
        int age = 50;
        int temp = 10;

        if (age > 20 && age < 45 && temp < 30 && temp > -20) {
            System.out.println("Можно идти гулять");
        }
        else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно гулять");
        }
        else if (age >45 && temp > -10 && temp < 25) {
            System.out.println("Тогда можно гулять");
        } else {
            System.out.println("Лучше остаться дома");
        }
    }
}
