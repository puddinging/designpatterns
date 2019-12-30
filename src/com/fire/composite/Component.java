package com.fire.composite;

/**
 * Component
 */
public abstract class Component {

    // 节点名字
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    /**
     * 节点深度
     * @param level
     */
    abstract void print(int level);

    /**
     * 添加节点
     * @param component
     */
    abstract public void add(Component component);

    /**
     * 移除节点
     * @param component
     */
    abstract public void remove(Component component);
}