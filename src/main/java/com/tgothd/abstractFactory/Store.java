package main.java.com.tgothd.abstractFactory;

/**
 * @author ShrJanLan
 * @create 2020-07-20 16:39
 */
public class Store {

    public void consume(String food, String taste, String supply) {
        if ("pizza".equals(food)) {
            if ("vegetables".equals(taste)) {
                if ("hot".equals(supply)) {
                    FactoryInterface factory = new HotFoodFactory();
                    factory.createPizza(taste);
                }else {
                    System.out.println("非常抱歉，我们没有这种产品族");
                }
            }else {
                System.out.println("非常抱歉，我们没有这种口味");
            }
        } else {
            System.out.println("非常抱歉，我们没有这类食物");
        }
    }

}
