package com.nf.lc.pattern.factoryMethod.maxFactory;

import com.nf.lc.pattern.factoryMethod.type.Phone;

//最大的工厂，生产手机
public interface PhoneFactory {
    Phone createPhone();
}
