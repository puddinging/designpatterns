/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:50:13
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 14:51:00
 */
package com.fire.decorator;

/**
 * DarkRoast
 */
public class DarkRoast implements Beverage {

    @Override
    public double cost() {
        return 1;
    }

    
}