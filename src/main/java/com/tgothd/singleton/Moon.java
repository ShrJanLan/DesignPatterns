package main.java.com.tgothd.singleton;

/**
 * 饿汉式的单列设计模式，是一种线程安全的单列设计模式
 * 因为它能够在类加载的过程中，初始化我们的静态变量
 * （如果对象比较复杂，或者说占用的内存资源比较大的话，建议在需要的时候才进行创建）
 * 如果我们的类在加载过程中就进行了创建，会影响我们程序的启动时间
 * @author ShrJanLan
 * @create 2020-07-20 18:36
 */
public class Moon {

    private static final Moon moon = new Moon();

    private Moon() {

    }

    public static Moon getInstance() {
        return moon;
    }

}
