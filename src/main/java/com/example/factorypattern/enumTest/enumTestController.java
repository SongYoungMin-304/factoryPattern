package com.example.factorypattern.enumTest;

import com.example.factorypattern.enums.imageEnum;
import com.example.factorypattern.enums.imageEnumCopy;
import com.example.factorypattern.enums.imageEnumResize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        if(imageEnum.A.toString().equals(type)){
            imageEnumCopy copy = imageEnumCopy.valueOf("A");
            List<String> copyList = copy.getCopyList();
            copyList.stream().forEach(o -> copy(o));

            imageEnumResize resize = imageEnumResize.valueOf("A");
            List<String> resizeList = resize.getResizeList();
            resizeList.stream().forEach(o -> resize(o));

        }else if(imageEnum.B.toString().equals(type)){
            imageEnumCopy copy = imageEnumCopy.valueOf("B");
            List<String> copyList = copy.getCopyList();
            copyList.stream().forEach(o -> copy(o));

            imageEnumResize resize = imageEnumResize.valueOf("B");
            List<String> resizeList = resize.getResizeList();
            resizeList.stream().forEach(o -> resize(o));
        }
    }

    @RequestMapping("/test5/{type}")
    public void test3(@PathVariable String type){

        imageEnumCopy copy = imageEnumCopy.valueOf(type);
        List<String> copyList = copy.getCopyList();
        copyList.stream().forEach(o -> copy(o));

        imageEnumResize resize = imageEnumResize.valueOf(type);
        List<String> resizeList = resize.getResizeList();
        resizeList.stream().forEach(o -> resize(o));


        copyList.stream().forEach(o -> delete(o));
        resizeList.stream().forEach(o -> delete(o));
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
