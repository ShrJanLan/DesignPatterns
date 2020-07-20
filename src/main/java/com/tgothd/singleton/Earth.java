package main.java.com.tgothd.singleton;

/**
 * 懒汉式，如果不考虑代码同步问题的话
 * （也就是说单线程运行的环境下，可以不去加我们的synchronized）
 * @author ShrJanLan
 * @create 2020-07-20 18:29
 */
public class Earth {

    private static Earth earth;

    private Earth() {

    }

    public synchronized static Earth getInstance() {//为了保证不同线程获取earth对象的唯一性
        if (earth == null) {
            return earth = new Earth();
        } else {
            return earth;
        }
    }

}
