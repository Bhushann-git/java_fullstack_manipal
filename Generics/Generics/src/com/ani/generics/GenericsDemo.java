package com.ani.generics;

import java.time.LocalDate;
import java.util.Date;

public class GenericsDemo {
    
    public void demo1() {
        Box bx = new Box();
        // bx.setAnything(new String());
        bx.setAnything(new Date());
        // bx.setAnything(new StringBuffer());

        String ob = (String)bx.getAnything();
    }

    public void demo2() {
        DynamicBox<String> db1 = new DynamicBox<String>();
        db1.setAnything("abc");
        String nm = db1.getAnything();

        DynamicBox<LocalDate> db2 = new DynamicBox<LocalDate>();
        db2.setAnything(LocalDate.now());
        LocalDate dt = db2.getAnything();

    }

    public void demo3() {
        BoundParam<Integer> bd1 = new BoundParam<>();
        BoundParam<Float> bd2 = new BoundParam<>();
        BoundParam<Number> bd3 = new BoundParam<>();
    }
}