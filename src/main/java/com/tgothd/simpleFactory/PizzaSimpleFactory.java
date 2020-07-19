package main.java.com.tgothd.simpleFactory;

/**
 * 核心类，工厂类，用于制造不同种类的pizza
 * 程序在稳定生产环境，如果新加入了一家店面，这时候我们需要加入新的pizza种类
 * 此时我们应该修改我们的Factory类，但是如此进行修改的话，会影响我们的其它100家分店
 * 这就是简单工厂模式的一个瓶颈
 * 最笨的方法，增加一个分店，为了不影响已经正常运行的分店，我们多增加一个工厂类
 * （但这不能解决根本问题，我们只能发展更好的设计模式，工厂模式应运而生）
 * @author ShrJanLan
 * @create 2020-07-19 21:00
 */
public class PizzaSimpleFactory {

    public Pizza createPizza(String typePizza) {
        if ("vegetables".equals(typePizza)) {
            return new VegetablesPizza();
        } else if ("meat".equals(typePizza)) {
            return new MeatPizza();
        } else {
            return null;
        }
    }

}
