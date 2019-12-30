/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 14:55:01
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 15:09:55
 */
package com.fire.decorator;

/**
 * Client
 * 装饰，最外层的方法会调用里边的方法，自我感觉算是值传递，一直往上调用
 */
public class Client {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        for (int i = 0; i < 100; i++) {
            beverage = new Mocha(beverage);
        }
        System.out.println(beverage.cost());
    }
}