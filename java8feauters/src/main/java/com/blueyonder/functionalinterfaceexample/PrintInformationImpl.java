package com.blueyonder.functionalinterfaceexample;

public class PrintInformationImpl implements PrintInformation{

    @Override
    public void printMessage(String message,String msg) {
        System.out.println("Hello all  --"+message);

    }

}
