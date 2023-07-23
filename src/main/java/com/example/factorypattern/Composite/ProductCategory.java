package com.example.factorypattern.Composite;

public abstract class ProductCategory {

    protected int id;
    protected String name;
    protected int price;

    public ProductCategory(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract int getCount();
    public abstract String getName();
    public abstract int getPrice();
    public abstract int getId();

    //
    public abstract void addProduct(ProductCategory product);
    public abstract void removeProduct(ProductCategory product);


}
