package main.java.com.tgothd.builder;

/**
 * 抽象建造者，相当于工厂设计模式的抽象工厂类，但是有区别
 * 建造者类更加关注机器人构建的细节
 * @author ShrJanLan
 * @create 2020-07-20 21:20
 */
public interface RobotBuilder {

    void createHead();   //细节

    void createBody();   //细节

    void createLegs();   //细节

    /**
     * 理解工厂设计模式与建造者模式的区别于相同点
     * 相同点：都是为了创建产品
     * 不同点：建造者模式更加关注细节（工厂设计模式中只有一个create方法）
     * @return
     */
    Robot createRobot();

}
