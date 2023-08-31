package com.mycompany.commons;

import com.mycompany.interfes.MyOtherInterface;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}