package main.java.com.tgothd.abstractFactory;

/**
 * @author ShrJanLan
 * @create 2020-07-20 15:34
 */
public class ChocolateMilk extends Milk {
    @Override
    public void prepare() {
        System.out.println("准备巧克力");
    }

    @Override
    public void make() {
        System.out.println("开始制作巧克力牛奶");
    }

    @Override
    public void complete() {
        System.out.println("巧克力牛奶制作完成");
    }
}
