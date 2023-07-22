package com.example.factorypattern.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum ImageEnumCopyV2 {
    P(Arrays.asList(ImageEnumDetailCopyV2.P, ImageEnumDetailCopyV2.L)),
    AP(Arrays.asList(ImageEnumDetailCopyV2.AP, ImageEnumDetailCopyV2.AL));

    public List<ImageEnumDetailCopyV2> imageEnumDetailCopyV2List;

    ImageEnumCopyV2(List<ImageEnumDetailCopyV2> imageEnumDetailCopyV2List) {
        this.imageEnumDetailCopyV2List = imageEnumDetailCopyV2List;
    }
}
