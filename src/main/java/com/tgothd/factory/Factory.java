package main.java.com.tgothd.factory;

/**
 * 抽象工厂类，也是工厂设计模式的一个核心思想类（面向接口编程）
 * @author ShrJanLan
 * @create 2020-07-19 22:01
 */
public interface Factory {

    Pizza createPizza(String type);

    /**
     * 为了与抽象工厂模式对比而添加的代码
     * 如果我们这个工厂生产的产品增加，也就是说我们的产品族不单一，可以直接在factory类中
     * 加入新的抽象方法供我们的具体工厂实现
     * @param type
     * @return
     */
    Milk createMilk(String type);

    /**
     * 为了与抽象工厂模式对比而添加的代码
     * 客户需要生pizza，工厂类中有一个cratePizza方法，但这个方法已经被pizzaStore进行了实现，而且做出来的产品是熟pizza
     * pizza的产品结构等级改变，原来的方法不满足要求，我们需要再次添加一个方法，用于制作新的等级结构产品
     * @return
     */
    Pizza crateRawPizza(String type);

}
