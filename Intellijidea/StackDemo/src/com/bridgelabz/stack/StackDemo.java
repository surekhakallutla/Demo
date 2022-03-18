package com.bridgelabz.stack;

import javax.lang.model.element.Element;

public class StackDemo {
    static int top = -1;
    static int size;
    static Element stack[] =new  Element[10];

    public boolean isFull() {
        return top > size;
    }

    public boolean isEmpty() {
        return top <= -1;
    }

    public void push(Element e) {
        if(isFull())
            System.out.println("Stack is Full");
        else {
            top++;
            stack[top] = e;
        }
    }

    public void pop() {
        if(isEmpty())
            System.out.println("Stack is Empty");
        else {
            System.out.println(stack[top] +" is removed");
            stack[top] = null;
            top--;
        }
    }
}
