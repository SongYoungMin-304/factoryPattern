package com.example.factorypattern.vo;


import com.example.factorypattern.enums.imageEnumCopyV2;
import com.example.factorypattern.enums.imageEnumDetailCopyV2;
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

    public static boolean getIsTrue(imageEnumCopyV2 imgEnumCopy, ImageVo tp){
        String value = "";
        if(imgEnumCopy == imageEnumCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumCopy == imageEnumCopyV2.AP){
            value = tp.getAp();
        }

        if(value.length() == 0){
            return false;
        }else{
            return true;
        }
    }

    public static String getParam(imageEnumCopyV2 imgEnumCopy, ImageVo tp){
        String value = "";
        if(imgEnumCopy == imageEnumCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumCopy == imageEnumCopyV2.AP){
            value = tp.getAp();
        }
        return value;
    }

    public static String getParam(imageEnumDetailCopyV2 imgEnumDetailCopy, ImageVo tp){
        String value = "";
        if(imgEnumDetailCopy == imageEnumDetailCopyV2.P){
            value = tp.getP();
        }
        if(imgEnumDetailCopy == imageEnumDetailCopyV2.L){
            value = tp.getL();
        }
        if(imgEnumDetailCopy == imageEnumDetailCopyV2.AP){
            value = tp.getAp();
        }
        if(imgEnumDetailCopy == imageEnumDetailCopyV2.AL){
            value = tp.getAl();
        }
        return value;
    }
}
