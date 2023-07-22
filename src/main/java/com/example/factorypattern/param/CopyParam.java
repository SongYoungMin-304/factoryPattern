package com.example.factorypattern.param;

import com.example.factorypattern.enums.ImageEnumCopyV2;
import com.example.factorypattern.enums.ImageEnumDetailCopyV2;
import com.example.factorypattern.vo.ImageVo;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CopyParam {

    // 이거는 List 로 copy 해야됨... imgUrl이 여러개 있어야 되서.... 근데 여기서 imgUrl 여러개로 관리해도 되는데...맘에 안들어... 이게 최선...
    private String imgUrl;

    private ImageEnumDetailCopyV2 imageEnumDetailCopyV2;

    public static List<CopyParam> makeCopy(ImageVo imageVo, ImageEnumCopyV2 imgEnumCopyV2){
        List<CopyParam> copyParams = new ArrayList<>();

        imgEnumCopyV2.getImageEnumDetailCopyV2List().stream().forEach(
                o -> copyParams.add(
                        CopyParam.builder()
                                .imgUrl(ImageVo.getParam(o, imageVo))
                                .imageEnumDetailCopyV2(o)
                                .build()
                )
        );

        return copyParams;
    }
}
