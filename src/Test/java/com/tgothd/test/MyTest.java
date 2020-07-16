package Test.java.com.tgothd.test;

import main.java.com.tgothd.demo.RealizeType;
import org.junit.Test;

/**
 * 单元测试
 * @author ShrJanLan
 * @create 2020-07-07 14:29
 */
public class MyTest extends Object {

    @Test
    public void realizeType() throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }

}