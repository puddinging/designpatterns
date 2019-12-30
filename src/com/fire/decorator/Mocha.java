/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:54:31
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 14:54:54
 */
package com.fire.decorator;

/**
 * Mocha
 */
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}