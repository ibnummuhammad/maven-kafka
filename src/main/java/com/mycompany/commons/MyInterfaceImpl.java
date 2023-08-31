package com.mycompany.commons;

import com.mycompany.interfes.MyOtherInterface;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
        System.out.println(MyInterface.FALSE);
        System.out.println(MyInterface.TRUE);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}