/*
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Descripttion: 
 * @Author: jiefeng
 * @Date: 2019-12-27 12:28:06
 * @LastEditors  : jiefeng
 * @LastEditTime : 2019-12-27 12:28:29
 */
package com.fire.bridge;

/**
 * RemoteControl
 */
public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}