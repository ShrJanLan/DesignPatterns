package main.java.com.tgothd.demo;

/**
 * 原型模式
 * @author ShrJanLan
 * @create 2020-07-07 14:26
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (RealizeType)super.clone();
    }

}
