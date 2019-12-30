/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:52:51
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 14:53:24
 */
package com.fire.decorator;

/**
 * Milk
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}