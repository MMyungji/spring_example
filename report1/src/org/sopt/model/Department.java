package org.sopt.model;

public class Department extends University{
    private int d_idx;
    private String d_name;
    private int d_number;
    private String d_type;

    @Override
    public String toString() {
        return "Department{" +
                "d_idx=" + d_idx +
                ", d_name='" + d_name + '\'' +
                ", d_number=" + d_number +
                ", d_type='" + d_type + '\'' +
                '}';
    }

    public Department(int u_idx, String u_name, int u_number, String u_address, int d_idx, String d_name, int d_number, String d_type) {
        super(u_idx, u_name, u_number, u_address);
        this.d_idx = d_idx;
        this.d_name = d_name;
        this.d_number = d_number;
        this.d_type = d_type;
    }

    public Department(int u_idx, String u_name, int u_number, String u_address) {
        super(u_idx, u_name, u_number, u_address);
    }


    public int getD_idx() {
        return d_idx;
    }

    public String getD_name() {
        return d_name;
    }

    public int getD_number() {
        return d_number;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_idx(int d_idx) {
        this.d_idx = d_idx;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public void setD_number(int d_number) {
        this.d_number = d_number;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
    }
}
