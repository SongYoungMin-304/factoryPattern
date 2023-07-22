/*
package com.example.factorypattern.param;

import com.example.factorypattern.enums.ImageInterface;
import com.example.factorypattern.vo.ImageVo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageParam<T extends ImageInterface> {

    private String imgUrl;

    private T t;

    public T makeParam(ImageVo imageVo, T t){
        return (T) ImageParam.builder()
                .imgUrl(ImageVo.getParam(t, imageVo))
                .t(t)
                .build();
    }

}
*/
