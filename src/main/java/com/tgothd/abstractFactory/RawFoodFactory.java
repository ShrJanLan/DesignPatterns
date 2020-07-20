package main.java.com.tgothd.abstractFactory;

/**
 * 这个工厂生产的是一个产品族，这个产品族中包含了牛奶和披萨
 * 这个产品族的等级结构是：raw
 * @author ShrJanLan
 * @create 2020-07-20 11:50
 */
public class RawFoodFactory implements FactoryInterface {
    @Override
    public Pizza createPizza(String type) {
        if("vegetables".equals(type)){
            //披萨的制作步骤
            Pizza pizza = new VegetablesPizza();
            pizza.prepare();
            //生冷食物的制作不需要make
            //pizza.make();
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
            //生冷食物的制作不需要make
            //milk.make();
            milk.complete();
            return milk;
        }else{
            return null;
        }
    }
}
