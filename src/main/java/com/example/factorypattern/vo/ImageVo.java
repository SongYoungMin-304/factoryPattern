package com.example.factorypattern.vo;


import com.example.factorypattern.enums.ImageEnumCopyV2;
import com.example.factorypattern.enums.ImageEnumDetailCopyV2;
import com.example.factorypattern.enums.ImageEnumResizeV2;
import com.example.factorypattern.enums.ImageInterface;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Builder
public class ImageVo {

    private String p;
    private String l;
    private String p1;
    private String p2;
    private String p3;
    private String p4;

    private String ap;
    private String al;
    private String ap1;
    private String ap2;
    private String ap3;
    private String ap4;

    public static boolean getIsTrue(ImageEnumCopyV2 imgEnumCopy, ImageVo tp){
        String value = "";
        if(imgEnumCopy == ImageEnumCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumCopy == ImageEnumCopyV2.AP){
            value = tp.getAp();
        }

        if(value.length() == 0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean getIsTrue(ImageEnumResizeV2 imgEnumResize, ImageVo imageVo){
        String value = "";
        if(imgEnumResize == ImageEnumResizeV2.P){
            value = imageVo.getP();
        }
        if(imgEnumResize == ImageEnumResizeV2.AP){
            value = imageVo.getAp();
        }

        if(value.length() == 0){
            return false;
        }else{
            return true;
        }
    }


    public static String getParam(ImageEnumCopyV2 imgEnumCopy, ImageVo tp){
        String value = "";
        if(imgEnumCopy == ImageEnumCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumCopy == ImageEnumCopyV2.AP){
            value = tp.getAp();
        }
        return value;
    }

    public static String getParam(ImageEnumDetailCopyV2 imgEnumDetailCopy, ImageVo tp){
        String value = "";
        if(imgEnumDetailCopy == ImageEnumDetailCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumDetailCopy == ImageEnumDetailCopyV2.L){
            value = tp.getL();
        }
        if(imgEnumDetailCopy == ImageEnumDetailCopyV2.AP){
            value = tp.getAp();
        }
        if(imgEnumDetailCopy == ImageEnumDetailCopyV2.AL){
            value = tp.getAl();
        }
        return value;
    }

    public static String getParam(ImageEnumResizeV2 imageEnumResizeV2, ImageVo imageVo){
        String value = "";
        if(imageEnumResizeV2 == ImageEnumResizeV2.P){
            value = imageVo.getP();
        }
        if(imageEnumResizeV2 == ImageEnumResizeV2.AP){
            value = imageVo.getAp();
        }
        return value;
    }
}
