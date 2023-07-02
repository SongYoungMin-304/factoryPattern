package com.example.factorypattern.Bridge;

import com.example.factorypattern.Bridge.impl.AbstractList;

public class Queue<T> extends List<T> {

    public Queue(AbstractList<T> list){
        super(list);
        System.out.println("Queue을 만듭니다.");
    }

    public void enQueue(T obj){
        impl.addElement(obj);
    }

    public T deQueue(){
        T element = impl.getElement(0);
        impl.deleteElement(0);
        return element;
    }
}
