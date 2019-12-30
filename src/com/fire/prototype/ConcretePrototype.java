/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 11:38:47
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 11:41:04
 */
package com.fire.prototype;

/**
 * ConcretePrototype
 * 原型模式，通过复制这个原型来创建对象
 */
public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }

}