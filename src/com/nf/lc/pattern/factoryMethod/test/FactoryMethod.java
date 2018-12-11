package com.nf.lc.pattern.factoryMethod.test;

import com.nf.lc.pattern.factoryMethod.entityFactory.HuaweiFactory;
import com.nf.lc.pattern.factoryMethod.entityFactory.IphoneFactory;
import com.nf.lc.pattern.factoryMethod.maxFactory.PhoneFactory;
import com.nf.lc.pattern.factoryMethod.type.Phone;

public class FactoryMethod {
    public static void main(String[] args) {
        PhoneFactory entityFactory = new IphoneFactory();
        Phone phone = entityFactory.createPhone();
        phone.play();
    }
}
