package org.sopt.model;

public class Professor extends Department {
    private int p_idx;
    private String p_name;
    private String p_dept;
    private  int p_number;
    private String p_major;

    public Professor(int u_idx, String u_name, int u_number, String u_address, int d_idx, String d_name, int d_number, String d_type, int p_idx, String p_name, String p_dept, int p_number, String p_major) {
        super(u_idx, u_name, u_number, u_address, d_idx, d_name, d_number, d_type);
        this.p_idx = p_idx;
        this.p_name = p_name;
        this.p_dept = p_dept;
        this.p_number = p_number;
        this.p_major = p_major;
    }

    public Professor(int u_idx, String u_name, int u_number, String u_address, int d_idx, String d_name, int d_number, String d_type) {
        super(u_idx, u_name, u_number, u_address, d_idx, d_name, d_number, d_type);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "p_idx=" + p_idx +
                ", p_name='" + p_name + '\'' +
                ", p_dept='" + p_dept + '\'' +
                ", p_number=" + p_number +
                ", p_major='" + p_major + '\'' +
                '}';
    }

    public int getP_idx() {
        return p_idx;
    }

    public String getP_name() {
        return p_name;
    }

    public String getP_dept() {
        return p_dept;
    }

    public int getP_number() {
        return p_number;
    }

    public String getP_major() {
        return p_major;
    }

    public void setP_idx(int p_idx) {
        this.p_idx = p_idx;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setP_dept(String p_dept) {
        this.p_dept = p_dept;
    }

    public void setP_number(int p_number) {
        this.p_number = p_number;
    }

    public void setP_major(String p_major) {
        this.p_major = p_major;
    }
}
