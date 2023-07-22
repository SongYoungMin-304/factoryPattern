package com.example.factorypattern.enums;

import lombok.Getter;

@Getter
public enum ImageEnumDetailResizeV2 {

    //P
    G("g","110","110"),
    H("h","120","120"),
    I("i","130","130"),

    AG("ag","110","110"),
    AH("ah","120","120"),
    AI("ai","130","130");

    String flag;
    String width;
    String heigth;

    ImageEnumDetailResizeV2(String flag, String width, String height){
        this.flag = flag;
        this.width = width;
        this.heigth = height;
    }


}
