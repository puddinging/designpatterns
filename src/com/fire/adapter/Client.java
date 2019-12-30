/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-26 11:32:43
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 17:26:11
 */
package com.fire.adapter;

/**
 * Client
 * 一个鸭子类传入火鸡类
 * 可以伪装成一个火鸡
 */
public class Client {

    public static void main(String[] args) {
        Turkey turkey =  new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}