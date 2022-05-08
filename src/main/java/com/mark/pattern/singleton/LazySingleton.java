package com.mark.pattern.singleton;

/**
 * @author : mark
 * @Date : 2022/5/8 上午10:31
 * 单例模式 - 懒汉模式
 */
public class LazySingleton {

    private LazySingleton(){
        System.out.printf(Thread.currentThread().getName());
    }

    private volatile static LazySingleton lazySingleton;

    //双重检测懒汉锁的模式
    public static LazySingleton getInstance(){

        //懒汉模式就是当对象为空的时候才去创建
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }



    //在多线程情况下
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                lazySingleton.getClass();
            }).start();
        }
    }
}
