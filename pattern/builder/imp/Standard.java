package com.nf.lc.pattern.builder.imp;

import com.nf.lc.pattern.builder.entity.Cat;

/**
 * 标准
 */
public interface Standard {
    void builderName();  //构建猫的名字
    void builderAge(); //构建猫的年龄
    void builderWeight();  //构建猫的体重
    void builderRemarks();  //构建猫的备注
    Cat createCat(); //返回构建的猫
}
