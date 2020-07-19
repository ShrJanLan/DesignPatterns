package main.java.com.tgothd.simpleFactory;

/**
 * 抽象产品类，作为父类出现，供各种pizza种类继承
 * @author ShrJanLan
 * @create 2020-07-19 20:45
 */
public abstract class Pizza {

    public abstract void prepare();

    public abstract void make();

    public abstract void complete();

}
