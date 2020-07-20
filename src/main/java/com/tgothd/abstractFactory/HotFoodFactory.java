package main.java.com.tgothd.abstractFactory;

/**
 * 这个工厂生产的是一个产品族，这个产品族中包含了牛奶和披萨
 * 这个产品族的等级结构是：hot
 * （因为不同等级结构的产品制作方式上有所区别，所以我们的制作流程会出现在具体工厂里）
 * 在抽象工厂模式中，具体工厂需要根据实际的生产需求进行分类实现
 * 达到的效果是：用不同的具体工厂实现分类，满足我们生产上的需求
 * （一般情况下，我们的具体工厂类更加多的去关心产品等级结构）
 * @author ShrJanLan
 * @create 2020-07-20 11:50
 */
public class HotFoodFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String type) {
        if("vegetables".equals(type)){
            //披萨的制作步骤
            Pizza pizza = new VegetablesPizza();
            pizza.prepare();
            pizza.make();
            pizza.complete();
            return pizza;
        }else{
            return null;
        }
    }

    @Override
    public Milk createMilk(String type) {
        if("chocolate".equals(type)){
            //牛奶的制作步骤
            Milk milk = new ChocolateMilk();
            milk.prepare();
            milk.make();
            milk.complete();
            return milk;
        }else{
            return null;
        }
    }
}
