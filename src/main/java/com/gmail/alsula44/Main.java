package com.gmail.alsula44;

public class Main {
    private static String msg2 = "Goodbye qa.guru";

    public static void main(String[] args) {
        System.out.println(getByeMessage());
        int i = (int) (Math.random() * 10);

        System.out.println("Случайное число:" + i);
    }

    private static String getByeMessage() {
        return msg2;
    }
}
