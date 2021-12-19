package com.company;

public class Box <T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box() {
    }

    public static <T> T getSomething(T... a){
        System.out.println("Find method value");
        return (T) a;
    }

    @Override
    public java.lang.String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
