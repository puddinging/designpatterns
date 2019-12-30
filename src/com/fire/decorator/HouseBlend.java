/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:51:09
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 14:51:31
 */
package com.fire.decorator;

/**
 * HouseBlend
 */
public class HouseBlend implements Beverage {

    @Override
    public double cost() {
        return 1;
    }

    
}