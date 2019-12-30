/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 11:17:21
 * @LastEditors: jiefeng
 * @LastEditTime: 2019-12-27 11:17:36
 */
package com.fire.simplefactory;

/**
 * MyProduct
 */
public class MyProduct1 implements Product{

    @Override
    public void go() {
        System.out.println("我是一号产品");
    }

    
}