package com.example.factorypattern.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum ImageEnumResizeV2{

    P(Arrays.asList(ImageEnumDetailResizeV2.G,ImageEnumDetailResizeV2.H,ImageEnumDetailResizeV2.I)),
    AP(Arrays.asList(ImageEnumDetailResizeV2.AG,ImageEnumDetailResizeV2.AH,ImageEnumDetailResizeV2.AI));

    public List<ImageEnumDetailResizeV2> imageEnumDetailResizeV2s;

    ImageEnumResizeV2(List<ImageEnumDetailResizeV2> imageEnumDetailResizeV2s) {
        this.imageEnumDetailResizeV2s = imageEnumDetailResizeV2s;
    }
}
