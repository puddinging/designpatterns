/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:51:41
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 14:54:11
 */
package com.fire.decorator;

/**
 * CondimentDecorator
 */
public abstract class CondimentDecorator implements Beverage{

    protected Beverage beverage;
}