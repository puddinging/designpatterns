package com.fire.facade;

/**
 * Facade
 * 使用外观设计模式，将一个类的细节封装起来
 */
public class Facade {

    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}