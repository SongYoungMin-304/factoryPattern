package com.example.factorypattern.param;

import com.example.factorypattern.enums.ImageEnumDetailResizeV2;
import com.example.factorypattern.enums.ImageEnumResizeV2;
import com.example.factorypattern.vo.ImageVo;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ResizeParam {

    // resize는 메인을 기반으로 하기 때문에 여러개 필요 x
    private String imgUrl;

    private ImageEnumDetailResizeV2 imageEnumDetailResizeV2;

    public static List<ResizeParam> makeResize(ImageVo imageVo, ImageEnumResizeV2 imageEnumResizeV2){

        List<ResizeParam> resizeParams = new ArrayList<>();

        imageEnumResizeV2.getImageEnumDetailResizeV2s().stream().forEach(
                o -> resizeParams.add(
                        ResizeParam.builder()
                                .imgUrl(ImageVo.getParam(imageEnumResizeV2, imageVo))
                                .imageEnumDetailResizeV2(o)
                                .build()
                )
        );

        return resizeParams;
    }

}
