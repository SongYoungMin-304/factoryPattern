package com.example.factorypattern.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Getter
public enum ImageEnumCopyV2{
    P(Arrays.asList(ImageEnumDetailCopyV2.P, ImageEnumDetailCopyV2.L));
    //AP(Arrays.asList(ImageEnumDetailCopyV2.AP, ImageEnumDetailCopyV2.AL));

    public List<ImageEnumDetailCopyV2> imageEnumDetailCopyV2List;

    ImageEnumCopyV2(List<ImageEnumDetailCopyV2> imageEnumDetailCopyV2List) {
        this.imageEnumDetailCopyV2List = imageEnumDetailCopyV2List;
    }

    public static Optional<ImageEnumCopyV2> check(String val) {
        try { return Optional.of(ImageEnumCopyV2.valueOf(val)); }
        catch (Exception e) {/* do nothing */}
        return Optional.empty();
    }
}
