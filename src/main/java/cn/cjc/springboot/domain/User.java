package cn.cjc.springboot.domain;

/**
 * @author debo
 * @date 2020-05-05
 */
public class User {

    private Integer userId;
    private String name;
    private String address;

    public User() {
    }

    public User(Integer userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
