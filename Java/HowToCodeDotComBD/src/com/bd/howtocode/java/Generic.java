package com.bd.howtocode.java;

public class Generic<T> {
    T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }

    public static void main(String[] args) {
        // make an integer type
        Generic<Integer> iObj = new Generic<Integer>(88);
        iObj.showType();
        int v = iObj.getObj();
        System.out.println("value: " + v);

        // make a string type
        Generic<String> stringGeneric = new Generic<String>("This is a generic");
        stringGeneric.showType();
        String str = stringGeneric.getObj();
        System.out.println("value: " + str);
    }
}
