package main.java.com.tgothd.simpleFactory;

/**
 * @author ShrJanLan
 * @create 2020-07-19 20:55
 */
public class MeatPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备meat");
    }

    @Override
    public void make() {
        System.out.println("开始制作肉类披萨");
    }

    @Override
    public void complete() {
        System.out.println("肉类披萨制作完成");
    }
}
