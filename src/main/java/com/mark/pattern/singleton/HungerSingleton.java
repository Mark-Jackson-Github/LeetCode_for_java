package com.mark.pattern.singleton;

/**
 * @author : mark
 * @Date : 2022/5/8 上午10:18
 * 单例模式 - 懒汉模式
 */
public class HungerSingleton {

    //浪费内存空间
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];
    private byte[] data4 = new byte[1024*1024];

    //构造方法私有
    private HungerSingleton(){}

    //new一个私有的对象
    private final static HungerSingleton huger = new HungerSingleton();


    public static HungerSingleton getInstance(){
        return huger;
    }
}
