package com.nf.lc.pattern.builder.entity;

/**
 * 实体类：猫
 */
public class Cat {
    private String name;  //猫的名字
    private int age;  //猫的年龄
    private double weight;  //猫的体重
    private String remarks;  //备注


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
