package com.nf.lc.pattern.factoryMethod.entity;

import com.nf.lc.pattern.factoryMethod.type.Phone;

public class Huawei implements Phone {
    @Override
    public void play() {
        System.out.println("玩华为手机");
    }
}
