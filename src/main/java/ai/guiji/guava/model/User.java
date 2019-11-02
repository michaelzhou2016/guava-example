package ai.guiji.guava.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * author: zhouliliang
 * Date: 2019/11/2 18:01
 * Description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 2569882961592695891L;

    private Long id;
    private String name;
    private String password;
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
