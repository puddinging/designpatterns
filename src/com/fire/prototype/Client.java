/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 11:42:35
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 11:59:19
 */
package com.fire.prototype;

/**
 * Client
 * 原型模式，复制了一个对象，然后创建另一个对象
 */
public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}       