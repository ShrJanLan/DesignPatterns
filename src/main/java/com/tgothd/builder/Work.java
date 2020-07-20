package main.java.com.tgothd.builder;

/**
 * Director指挥者
 * @author ShrJanLan
 * @create 2020-07-20 21:53
 */
public class Work {
    public Robot buildRobot(RobotBuilder robotBuilder) {
        robotBuilder.createHead();
        robotBuilder.createBody();
        robotBuilder.createLegs();
        return robotBuilder.createRobot();
    }
}
