package com.nf.lc.pattern.factoryMethod.entity;

import com.nf.lc.pattern.factoryMethod.type.Phone;

public class Iphone implements Phone {
    @Override
    public void play() {
        System.out.println("玩IPhone手机");
    }
}
