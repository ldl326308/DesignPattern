package com.nf.lc.pattern.builder.director;

import com.nf.lc.pattern.builder.entity.Cat;
import com.nf.lc.pattern.builder.imp.Standard;

public class DirectorNewCat {
    public Cat createCatByDirector(Standard standard){
        standard.builderName();
        standard.builderAge();
        standard.builderWeight();
        standard.builderRemarks();
        return standard.createCat();
    }
}
