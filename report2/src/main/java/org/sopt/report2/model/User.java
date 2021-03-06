package org.sopt.report2.model;

public class User {
    public int getUser_idx() {
        return user_idx;
    }

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_idx=" + user_idx +
                ", name='" + name + '\'' +
                ", part='" + part + '\'' +
                '}';
    }

    private int user_idx;
    private String name;
    private String part;
}
