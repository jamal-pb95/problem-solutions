package com.bd.howtocode.java;

public class Node<Type> {
    protected Type value;
    protected Node<Type> next;

    public Node(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public Node<Type> getNext() {
        return next;
    }

    public void setNext(Node<Type> next) {
        this.next = next;
    }
}
