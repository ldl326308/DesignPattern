package com.nf.lc.pattern.factoryMethod.entityFactory;

import com.nf.lc.pattern.factoryMethod.entity.Iphone;
import com.nf.lc.pattern.factoryMethod.type.Phone;
import com.nf.lc.pattern.factoryMethod.maxFactory.PhoneFactory;

public class IphoneFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Iphone();
    }
}
