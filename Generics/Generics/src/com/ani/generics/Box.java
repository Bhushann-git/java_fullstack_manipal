package com.ani.generics;

import java.sql.Date;

public class Box {
    
    private Object anything;

    public Object getAnything() {
        return anything;
    }

    public void setAnything(Object anything) {

        if(anything instanceof String) {
        }
        if(anything instanceof Date) {
        }
        if(anything instanceof StringBuffer) {
        }

        this.anything = anything;
    }
}