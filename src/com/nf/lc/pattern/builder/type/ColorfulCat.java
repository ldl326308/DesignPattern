package com.nf.lc.pattern.builder.type;

import com.nf.lc.pattern.builder.imp.Standard;
import com.nf.lc.pattern.builder.entity.Cat;

/**
 * 构建一只花猫
 */
public class ColorfulCat implements Standard {
    private Cat newCat = null;

    public ColorfulCat (){
        newCat = new Cat();//实例化Cat
    }

    @Override
    public void builderName() {
        newCat.setName("花猫"); //构建名字
    }

    @Override
    public void builderAge() {
        newCat.setAge(1); //构建年龄
    }

    @Override
    public void builderWeight() {
        newCat.setWeight(5.1);  //构建体重
    }

    @Override
    public void builderRemarks() {
        newCat.setRemarks("这是一只花猫");
    }

    @Override
    public Cat createCat() {
        return newCat;  //返回构建的猫
    }
}
