package Test.java.com.tgothd.test;

import main.java.com.tgothd.abstractFactory.Store;
import main.java.com.tgothd.demo.RealizeType;
import main.java.com.tgothd.factory.PizzaStore2;
import main.java.com.tgothd.simpleFactory.PizzaSimpleFactory;
import main.java.com.tgothd.simpleFactory.PizzaStore;
import org.junit.Test;

/**
 * 单元测试
 * @author ShrJanLan
 * @create 2020-07-07 14:29
 */
public class MyTest extends Object {

    @Test
    public void testRealizeType() throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }

    @Test
    public void testSimpleFactory(){
        PizzaSimpleFactory pizzaSimpleFactory = new PizzaSimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaSimpleFactory);
        pizzaStore.orderPizza("vegetables");
        pizzaStore.orderPizza("meat");
    }

    @Test
    public void testFactory(){
        main.java.com.tgothd.factory.PizzaStore pizzaStore = new main.java.com.tgothd.factory.PizzaStore();
        pizzaStore.orderPizza("vegetables");
        PizzaStore2 pizzaStore2 = new PizzaStore2();
        pizzaStore2.orderPizza("meat");
    }

    @Test
    public void testAbstractFactory() {
        Store store = new Store();
        store.consume("pizza","vegetables","hot");
    }

}
