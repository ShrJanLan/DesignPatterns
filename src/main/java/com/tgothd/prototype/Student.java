package main.java.com.tgothd.prototype;

import java.io.*;
import java.util.Date;
import java.util.List;

/**
 * @author ShrJanLan
 * @create 2020-07-21 13:25
 */
public class Student implements Serializable {

    private String name;

    private Date birthday;

    private School school;

    private List<String> friends;   //这个jdk自己封装的方法，没有办法让它去实现我们cloneable接口

    /**
     * 核心方法，用与clone我们的Student对象
     * 现在发现，这个克隆方法有一定的问题。
     * 如果克隆出来的新对象改变一些属性的时候，我们的原型对象也会出现问题
     * 浅克隆不能够完全去克隆我们的成员变量，只是一个地址值的引用
     * 如果不重新new属性值的情况下，会影响我们的原型对象
     */
    public Student deepClone() throws IOException, ClassNotFoundException {
        //第一版：浅克隆
        //return (Student) super.clone();

        //第二版：普通深克隆
        //Student student = (Student) super.clone();
        //对于我们的类，如果想实现深度克隆，并且没有jdk自带的这种类（list，linked，array）
        // ，可以考虑用这种深度克隆方式，但是这种方式是有缺点的，导致相关类都要被强制实现cloneable接口
        //student.school = school.clone();
        //student.friends = friends.clone();
        //return student;

        //深度克隆是基于序列化接口，与java.lang.Cloneable无关
        //序列化方式克隆对象，其实是对流的操作复制
        //将对象写入到流中
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);//当前对象
        //从流中将对象读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Student student = (Student) oi.readObject();
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
