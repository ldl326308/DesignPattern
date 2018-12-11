package com.nf.lc.pattern.builder.type;

import com.nf.lc.pattern.builder.entity.Cat;
import com.nf.lc.pattern.builder.imp.Standard;

/**
 * 构建一只笨的猫
 */
public class StupidCat implements Standard {
    private Cat newCat = null;

    public StupidCat(){
        newCat = new Cat();
    }

    @Override
    public void builderName() {
        newCat.setName("笨猫"); //构建笨猫的名字
    }

    @Override
    public void builderAge() {
        newCat.setAge(2); //构建笨猫的年龄
    }

    @Override
    public void builderWeight() {
        newCat.setWeight(6.5); //构建笨猫的体重
    }

    @Override
    public void builderRemarks() {
        newCat.setRemarks("这是一只很笨的猫");
    }

    @Override
    public Cat createCat() {
        return newCat;  //返回构建的猫
    }
}
