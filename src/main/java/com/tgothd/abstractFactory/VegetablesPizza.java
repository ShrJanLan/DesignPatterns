package main.java.com.tgothd.abstractFactory;

/**
 * @author ShrJanLan
 * @create 2020-07-20 15:30
 */
public class VegetablesPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("开始准备蔬菜");
    }

    @Override
    public void make() {
        System.out.println("开始制作蔬菜披萨");
    }

    @Override
    public void complete() {
        System.out.println("蔬菜披萨制作完成");
    }
}
