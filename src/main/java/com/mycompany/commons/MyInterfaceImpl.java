package com.mycompany.commons;

import com.mycompany.interfes.MyOtherInterface;
import com.mycompany.interfes.MySubInterface;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface, MySubInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
        System.out.println(MyInterface.FALSE);
        System.out.println(MyInterface.TRUE);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

    public void saiHello() {
        System.out.println("saiHello old");
    }

    public void saiGoodbye() {
        System.out.println("saiGoodby");
    }

    public void sayItAll() {
        System.out.println("sayItAll");
    }
}