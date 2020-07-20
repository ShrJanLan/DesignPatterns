package main.java.com.tgothd.builder;

/**
 * @author ShrJanLan
 * @create 2020-07-20 21:33
 */
public class SmartRobotBuilder implements RobotBuilder {

    private Robot robot = new Robot();

    @Override
    public void createHead() {
        String head = "Head";
        String brain = "Smart";
        String assemble = brain+head;
        robot.setHead(assemble);
    }

    @Override
    public void createBody() {
        robot.setBody("Body");
    }

    @Override
    public void createLegs() {
        String leg = "Leg";
        String number = "Single";
        String assemble = number+leg;
        robot.setLegs(assemble);
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}
