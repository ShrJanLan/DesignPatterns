package main.java.com.tgothd.prototype;

import java.io.Serializable;

/**
 * 这个school不想提供克隆方法，但是现在被迫提供
 * 造成了很多类的代码臃肿，只要是相关类都写上clone
 * @author ShrJanLan
 * @create 2020-07-21 13:30
 */
public class School implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
