package gp.firstpart.singleton.lazy;

/**
 * @author : mark
 * @Date : 2021/10/11 下午3:24
 * 懒汉单例
 * 在外部需要使用的时候才进行示例化
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){};

    //静态块，公共内存区域
    private static LazySimpleSingleton lazySimpleSingleton = null;

    public synchronized static LazySimpleSingleton getInstance(){
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
