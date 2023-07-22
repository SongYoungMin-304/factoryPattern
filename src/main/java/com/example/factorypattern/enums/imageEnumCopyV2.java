package com.example.factorypattern.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum imageEnumCopyV2 {
    P(Arrays.asList(imageEnumDetailCopyV2.P, imageEnumDetailCopyV2.L)),
    AP(Arrays.asList(imageEnumDetailCopyV2.AP, imageEnumDetailCopyV2.AL));

    public List<imageEnumDetailCopyV2> imageEnumDetailCopyV2List;

    imageEnumCopyV2(List<imageEnumDetailCopyV2> imageEnumDetailCopyV2List) {
        this.imageEnumDetailCopyV2List = imageEnumDetailCopyV2List;
    }
}
