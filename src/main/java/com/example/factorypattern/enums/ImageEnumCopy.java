package com.example.factorypattern.enums;

import java.util.Arrays;
import java.util.List;

public enum ImageEnumCopy implements ImageInterface{

    A(Arrays.asList("1","2","3","4","5")),
    B(Arrays.asList("1","2","3","4","5"));

    private List<String> copyList;

    ImageEnumCopy(List<String> list) {
        this.copyList = list;
    }

    public List<String> getCopyList() {
        return copyList;
    }

    public void setCopyList(List<String> copyList) {
        this.copyList = copyList;
    }

    @Override
    public ImageEnumResize getType() {
        return null;
    }
}
