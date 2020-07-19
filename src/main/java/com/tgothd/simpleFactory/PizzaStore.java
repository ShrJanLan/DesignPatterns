package main.java.com.tgothd.simpleFactory;

/**
 * @author ShrJanLan
 * @create 2020-07-19 21:06
 */
public class PizzaStore {

    private PizzaSimpleFactory pizzaSimpleFactory;

    public PizzaStore(PizzaSimpleFactory pizzaSimpleFactory) {
        this.pizzaSimpleFactory = pizzaSimpleFactory;
    }

    public void orderPizza(String typePizza) {
        System.out.println("客户开始预订披萨...类型是：" + typePizza);
        Pizza pizza = pizzaSimpleFactory.createPizza(typePizza);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        System.out.println("披萨制作完成");
    }

}
