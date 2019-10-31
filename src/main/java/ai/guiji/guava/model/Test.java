package ai.guiji.guava.model;

import java.io.Serializable;

public class Test implements Serializable {
    private static final long serialVersionUID = 6334325495434998769L;

    private Integer id;
    private String name;

    public Test() {
    }

    public Test(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
