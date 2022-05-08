package com.mark.pattern.singleton;

/**
 * @author : mark
 * @Date : 2022/5/8 上午10:31
 * 单例模式 - 懒汉模式
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance(){

        //懒汉模式就是当对象为空的时候才去创建
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}
