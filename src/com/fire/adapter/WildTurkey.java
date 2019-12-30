/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-26 11:29:08
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-26 11:30:05
 */
package com.fire.adapter;

/**
 * WildTurkey
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("火鸡叫");
    }

    
}