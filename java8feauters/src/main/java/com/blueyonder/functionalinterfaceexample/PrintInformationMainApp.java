package com.blueyonder.functionalinterfaceexample;

public class PrintInformationMainApp {

    public static void main(String[] args) {
        PrintInformationImpl pil = new PrintInformationImpl();
        pil.printMessage("I am functional interface", " ---"); // calling the abstract method

        PrintInformation.printInformation(); //calling static method
        pil.printInfo();//calling default method

        // Writing implementation of an abstract method using lambda expression
        PrintInformation printInfo = (message,msg) -> {System.out.println(message+msg);};
        printInfo.printMessage(
                "I am using lambda expression to show you how to implement an abstract method of an Interface"," ---");

    }
}
