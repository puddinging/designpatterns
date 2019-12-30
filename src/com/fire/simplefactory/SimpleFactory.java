/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 11:18:38
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 11:33:13
 */
package com.fire.simplefactory;

/**
 * SimpleFactory
 * 简单工厂：
 * 如果业务逻辑代码出现类似判断不同情况创建不同接口然后获取不同类的代码，推荐使用工厂模式来创建类
 * 工厂方法：
 * 此工厂可以设计成一个抽象类，然后将产生不同类的方法作为一个抽象方法，用工厂类的子类来实现
 * 抽象工厂
 * 抽象工厂创建的是对象家族，即许多个相关的类，他们之间是一个组合的关系
 * 抽象工厂也使用了工厂方法，但是抽象工厂不仅仅创建了一个对象，这也是他和抽象方法的区别，从高层次来说，抽象工厂使用了组合
 * 而工厂方法使用了继承
 */
public class SimpleFactory {

    public Product createProduct(int type){
        if (type == 1) {
            return new MyProduct1();
        } else if (type == 2) {
            return new MyProduct2();
        } else {
            return new MyProduct1();
        }
    }

    public static void main(String[] args) {
        Product product1 = new SimpleFactory().createProduct(1);
        product1.go();
        
        Product product2 = new SimpleFactory().createProduct(2);
        product2.go();
    }
}