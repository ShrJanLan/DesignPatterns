package Test.java.com.tgothd.test;

import main.java.com.tgothd.abstractFactory.Store;
import main.java.com.tgothd.builder.Robot;
import main.java.com.tgothd.builder.RobotBuilder;
import main.java.com.tgothd.builder.SmartRobotBuilder;
import main.java.com.tgothd.builder.Work;
import main.java.com.tgothd.factory.PizzaStore2;
import main.java.com.tgothd.prototype.School;
import main.java.com.tgothd.prototype.Student;
import main.java.com.tgothd.simpleFactory.PizzaSimpleFactory;
import main.java.com.tgothd.simpleFactory.PizzaStore;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 单元测试
 * @author ShrJanLan
 * @create 2020-07-07 14:29
 */
public class MyTest extends Object {

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

    @Test
    public void testBuilder() {
        Work work = new Work();
        RobotBuilder robotBuilder = new SmartRobotBuilder();
        Robot robot = work.buildRobot(robotBuilder);
        System.out.println(robot.getHead());
        System.out.println(robot.getBody());
        System.out.println(robot.getLegs());
    }

    @Test
    public void testPrototype() throws IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("张三");
        student.setBirthday(new Date(0));
        School school = new School();
        school.setName("北大");
        student.setSchool(school);
        List<String> friends = new ArrayList<>();
        friends.add("李四");
        student.setFriends(friends);

        Student student2 = student.deepClone();
        //对于String类型，它是一个final类，不允许继承复写
        //代表的是新建一个String，相当于new String("王五")
        student2.setName("王五");
        //同理，我们的日期，也是通过new关键字创建的
        student2.setBirthday(new Date());
        //这里并没有新建一个school,而是使用原来的
        student2.getSchool().setName("剑桥");
        //这里并没有新建一个arrayList,而是使用原来的
        student2.getFriends().add("王麻子");

        System.out.println("姓名："+student.getName());
        System.out.println("生日："+student.getBirthday());
        System.out.println("学校："+student.getSchool().getName());
        System.out.print("朋友：");
        for (String friend : student.getFriends()) {
            System.out.print(friend + " ");
        }
        System.out.println("\n---------------");
        System.out.println("姓名："+student2.getName());
        System.out.println("生日："+student2.getBirthday());
        System.out.println("学校："+student2.getSchool().getName());
        System.out.print("朋友：");
        for (String friend : student2.getFriends()) {
            System.out.print(friend + " ");
        }
    }

}
