package gp.firstpart.singleton.hungry;

/**
 * @author : mark
 * @Date : 2021/10/11 下午2:40
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {

        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){};

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
