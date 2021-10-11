package gp.firstpart.singleton.hungry;

/**
 * @author : mark
 * @Date : 2021/10/11 下午2:16
 * 单例模式-饿汉模式
 * 它的类加载得时候就立即初始化，并且创建单例对象
 * 优点：没有任何加锁，执行效率比较高
 * 缺点：类在加载的时候就初始化，不管是否使用，都会占用内存
 *
 *
 *
 */
public class HungrySingleton {

    //先静态，后动态
    //先属性，后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
