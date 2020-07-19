package main.java.com.tgothd.factory;

/**
 * 这个时候我们发现，如果新开店面的话，只需要实现factory，不需要修改factory类
 * （如果新增加分店的话，不会影响其它店的正常开业。我们只关心目前所开店面的代码）
 * 目前，我们所说的springboot和springcloud，以及新接触过的热部署、热加载、热启动，
 * 能够在生产环境中，以非常高效的速度加载并运行新添加的代码
 * @author ShrJanLan
 * @create 2020-07-19 22:08
 */
public class PizzaStore2 implements Factory {

    public void orderPizza(String type) {
        System.out.println("客户开始预订披萨...类型是："+type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        System.out.println("披萨制作完成");
    }

    @Override
    public Pizza createPizza(String type) {
        if ("meat".equals(type)) {
            return new MeatPizza();
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
        return null;
    }
}
