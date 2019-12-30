/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-26 11:30:17
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-26 11:38:09
 */
package com.fire.adapter;

/**
 * TurkeyAdapter
 * 适配器模式
 * TurkeyAdapter 继承了 Duck 类，但是传入了一个 Turkey 类，并且在quack()方法里边调用 Turkey 类的 gobble() 方法
 * 可以通过适配器模式将一个类接口转换成另一个用户需要的接口
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey tukey){
        this.turkey = tukey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    
}