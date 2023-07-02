package com.example.factorypattern.Bridge.impl;

public interface AbstractList<T> {

    void addElement(T obj);
    T deleteElement(int i);
    T getElement(int i);
    public int insertElement(T obj, int i);
    public int getElementSize();

}
