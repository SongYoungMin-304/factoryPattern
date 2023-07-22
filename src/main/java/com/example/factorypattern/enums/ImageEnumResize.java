package com.example.factorypattern.enums;

import java.util.Arrays;
import java.util.List;

public enum ImageEnumResize implements ImageInterface{

    A(Arrays.asList("11","22")),
    B(Arrays.asList("11","22"));

    private List<String> resizeList;

    ImageEnumResize(List<String> list) {
        this.resizeList = list;
    }

    public List<String> getResizeList() {
        return resizeList;
    }

    public void setResizeList(List<String> resizeList) {
        this.resizeList = resizeList;
    }

    @Override
    public ImageEnumResize getType() {
        return this;
    }
}
