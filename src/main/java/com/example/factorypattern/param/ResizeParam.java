package com.example.factorypattern.param;

import com.example.factorypattern.enums.ImageEnumResizeV2;
import com.example.factorypattern.vo.ImageVo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResizeParam {

    // resize는 메인을 기반으로 하기 때문에 여러개 필요 x
    private String imgUrl;

    private ImageEnumResizeV2 imageEnumResizeV2;

    public static ResizeParam makeResize(ImageVo imageVo, ImageEnumResizeV2 imageEnumResizeV2){

        return ResizeParam.builder()
                        .imgUrl(ImageVo.getParam(imageEnumResizeV2, imageVo))
                                .imageEnumResizeV2(imageEnumResizeV2)
                                        .build();
    }

}
