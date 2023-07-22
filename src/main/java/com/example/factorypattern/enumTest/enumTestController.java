package com.example.factorypattern.enumTest;

import com.example.factorypattern.enums.*;
import com.example.factorypattern.param.CopyParam;
import com.example.factorypattern.param.ResizeParam;
import com.example.factorypattern.vo.ImageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class enumTestController {

    @RequestMapping("/test3/{type}")
    public void test(@PathVariable String type){

        if("A".equals(type)){
            copy("A1");
            copy("A2");
            copy("A3");
            copy("A4");
            copy("A5");

            resize("A11");
        }else if("B".equals(type)){
            copy("B1");
            copy("B2");
            copy("B3");
            copy("B4");
            copy("B5");

            resize("B11");
        }else if("C".equals(type)){
            copy("C1");
            copy("C2");
            copy("C3");
            copy("C4");
            copy("C5");

            resize("C11");
        }else if("D".equals(type)){
            copy("D1");
            copy("D2");
            copy("D3");
            copy("D4");
            copy("D5");

            resize("D11");
        }else if("E".equals(type)){
            copy("E1");
            copy("E2");
            copy("E3");
            copy("E4");
            copy("E5");

            resize("E11");
        }

    }

    @RequestMapping("/test4/{type}")
    public void test2(@PathVariable String type){
        if(ImageEnum.A.toString().equals(type)){
            ImageEnumCopy copy = ImageEnumCopy.valueOf("A");
            List<String> copyList = copy.getCopyList();
            copyList.stream().forEach(o -> copy(o));

            ImageEnumResize resize = ImageEnumResize.valueOf("A");
            List<String> resizeList = resize.getResizeList();
            resizeList.stream().forEach(o -> resize(o));

        }else if(ImageEnum.B.toString().equals(type)){
            ImageEnumCopy copy = ImageEnumCopy.valueOf("B");
            List<String> copyList = copy.getCopyList();
            copyList.stream().forEach(o -> copy(o));

            ImageEnumResize resize = ImageEnumResize.valueOf("B");
            List<String> resizeList = resize.getResizeList();
            resizeList.stream().forEach(o -> resize(o));
        }
    }

    @RequestMapping("/test5/{type}")
    public void test3(@PathVariable String type){

        ImageEnumCopy copy = ImageEnumCopy.valueOf(type);
        List<String> copyList = copy.getCopyList();
        copyList.stream().forEach(o -> copy(o));

        ImageEnumResize resize = ImageEnumResize.valueOf(type);
        List<String> resizeList = resize.getResizeList();
        resizeList.stream().forEach(o -> resize(o));


        copyList.stream().forEach(o -> delete(o));
        resizeList.stream().forEach(o -> delete(o));
    }

    @RequestMapping("/test6")
    public void test4(){
        ImageVo imageVo = ImageVo.builder()
                .p("p")
                .l("l")
                .ap("ap")
                .al("al")
                .p1("p1")
                .p2("p2")
                .p3("p3")
                .p4("p4")
                .ap1("ap1")
                .ap2("ap2")
                .ap3("ap3")
                .ap4("ap4")
                .build();

        for(ImageEnumCopyV2 imageEnumCopy : ImageEnumCopyV2.values()){
            if(ImageVo.getIsTrue(imageEnumCopy, imageVo)){
                // resize는 하나의 targetImg 를 가지고 있고...
                // copy 는 여러개의 targetImg 를 가지고 있어야 해서 리스트로 만들
                List<CopyParam> copyParams = CopyParam.makeCopy(imageVo, imageEnumCopy);
                this.copyImage(copyParams);
            }
        }


        // resize는 imageUrl 하나로 관리하면 되니까 더 편함 ㅇㅇ
        for(ImageEnumResizeV2 imageEnumResizeV2 : ImageEnumResizeV2.values()){
            if(ImageVo.getIsTrue(imageEnumResizeV2, imageVo)){
                ResizeParam resizeParam = ResizeParam.makeResize(imageVo, imageEnumResizeV2);
                this.resizeImage(resizeParam);
            }
        }



    }

    public void copyImage(List<CopyParam> copyParam){
        // 대상 이미지
        copyParam.stream().forEach(
                o -> {
                    log.info("copy test1 :"+o.getImgUrl());
                    log.info("copy test2 :"+o.getImageEnumDetailCopyV2().getFlag());
                    log.info("copy test3 :"+o.getImageEnumDetailCopyV2().getWidth());
                    log.info("copy test4 :"+o.getImageEnumDetailCopyV2().getHeigth());
                }
        );
    }

    public void resizeImage(ResizeParam resizeParam){
        // 대상 이미지
        log.info("resize test1 :" +resizeParam.getImgUrl());

        resizeParam.getImageEnumResizeV2().getImageEnumDetailResizeV2s().stream()
                        .forEach(o -> {
                            log.info("resize test2 :"+o.getFlag());
                            log.info("resize test2 :"+o.getWidth());
                            log.info("resize test2 :"+o.getHeigth());
                        });
    }
    

    public void copy(String type){
        System.out.println("copy" + type);
    }

    public void resize(String type){
        System.out.println("resize" + type);
    }

    public void delete(String type){
        System.out.println("delete" + type);
    }

}
