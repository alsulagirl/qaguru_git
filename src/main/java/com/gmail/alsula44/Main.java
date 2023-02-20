package com.gmail.alsula44;

public class Main {
    private static String msg = "Hello qa.guru";
        
    private static String msg2 = "Goodbye qa.guru";

    public static void main(String[] args) {
        
        System.out.println(getByeMessage());
    }

    
    private static String getByeMessage() {
        return msg2;
    }
}
