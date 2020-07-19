package main.java.com.tgothd.factory;

/**
 * @author ShrJanLan
 * @create 2020-07-19 22:08
 */
public class PizzaStore implements Factory {

    public void orderPizza(String type) {
        System.out.println("客户开始预订披萨...类型是：" + type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        System.out.println("披萨制作完成");
    }

    public void orderRawPizza(String type) {
        System.out.println("客户开始预订生披萨...类型是：" + type);
        Pizza pizza = crateRawPizza(type);
        pizza.prepare();
        pizza.complete();
        System.out.println("生披萨制作完成");
    }

    /**
     * 现在来看，我们的店面不管有多少pizza种类，都由自己进行控制
     * 如果该店面新加了pizza种类，只需修改自己店的代码，不会影响其它店的正常运行
     * @param typePizza
     * @return
     */
    @Override
    public Pizza createPizza(String type) {
        if ("vegetables".equals(type)) {
            return new VegetablesPizza();
        } else {
            return null;
        }
    }

    @Override
    public Milk createMilk(String type) {
        return null;
    }

    @Override
    public Pizza crateRawPizza(String type) {
        if ("vegetables".equals(type)) {
            return new VegetablesPizza();
        } else {
            return null;
        }
    }
}
