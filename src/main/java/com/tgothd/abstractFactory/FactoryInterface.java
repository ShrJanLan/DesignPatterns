package main.java.com.tgothd.abstractFactory;

/**
 * 现在发现这个工厂类，没有创建产品等级结构的方法
 * 这是与工厂设计模式的区别
 * 它只暴露给了外面一个信息，这个信息是createPizza和createMilk
 * @author ShrJanLan
 * @create 2020-07-20 11:40
 */
public interface FactoryInterface {

    /**
     * 我们能够看到，我们的接口类，只需要关心我们的产品族，
     * 无论该产品有多少个等级，我们只有这样的简单的明了的两种或者多种抽象方法
     * 产品等级多数情况下交由具体工厂实现
     * @param type
     * @return
     */
    Pizza createPizza(String type);

    Milk createMilk(String type);

}
