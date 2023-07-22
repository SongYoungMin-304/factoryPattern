package com.example.factorypattern.enums;

import lombok.Getter;

@Getter
public enum imageEnumDetailCopyV2 {

    P("p","100","100"),
    L("l","100","100"),
    AP("ap","100","100"),
    AL("al","100","100");

    String flag;
    String width;
    String heigth;

    imageEnumDetailCopyV2(String flag, String width, String height) {
        this.flag = flag;
        this.width = width;
        this.heigth = height;
    }
}
