package com.nf.lc.pattern.builder.test;

import com.nf.lc.pattern.builder.director.DirectorNewCat;
import com.nf.lc.pattern.builder.entity.Cat;
import com.nf.lc.pattern.builder.type.ColorfulCat;
import com.nf.lc.pattern.builder.type.StupidCat;

public class BuilderCatTest {

    public static void main(String[] args) {
        DirectorNewCat newCat = new DirectorNewCat();

        //告诉它要构建一只花猫
        Cat colorfulCat = newCat.createCatByDirector(new ColorfulCat());
        showInfo(colorfulCat);

        //构建一只笨笨的猫
        Cat stupidCat = newCat.createCatByDirector(new StupidCat());
        showInfo(stupidCat);

    }

    public static void showInfo(Cat cat){
        System.out.println("猫的信息是："+cat.getName()+" "+cat.getAge()+"岁 "+cat.getWeight()+"千克 "+cat.getRemarks());
    }


}
