package com.nf.lc.pattern.factoryMethod.entityFactory;

import com.nf.lc.pattern.factoryMethod.entity.Huawei;
import com.nf.lc.pattern.factoryMethod.maxFactory.PhoneFactory;
import com.nf.lc.pattern.factoryMethod.type.Phone;

public class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Huawei();
    }
}
