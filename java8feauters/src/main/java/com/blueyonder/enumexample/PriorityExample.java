package com.blueyonder.enumexample;

import java.util.Scanner;

public class PriorityExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        Priority priority =Priority.valueOf(choice);
        switch(priority) {
            case LOW:
                System.out.println("Priority is Low");
                break;
            case MEDIUM:
                System.out.println("Priority is Medium");
                break;
            case HIGH:
                System.out.println("Priority is High");
                break;
            case CRITICAL:
                System.out.println("Priority is Critical");
                break;
        }
    }
}
