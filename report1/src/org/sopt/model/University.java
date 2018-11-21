package org.sopt.model;

public class University {
    private int u_idx;
    private String u_name;
    private int u_number;
    private String u_address;

    public University(int u_idx, String u_name, int u_number, String u_address) {
        this.u_idx = u_idx;
        this.u_name = u_name;
        this.u_number = u_number;
        this.u_address = u_address;
    }

    public int getU_idx() {
        return u_idx;
    }

    public String getU_name() {
        return u_name;
    }

    public int getU_number() {
        return u_number;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_idx(int u_idx) {
        this.u_idx = u_idx;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public void setU_number(int u_number) {
        this.u_number = u_number;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    @Override
    public String toString() {
        return "University{" +
                "u_idx=" + u_idx +
                ", u_name='" + u_name + '\'' +
                ", u_number=" + u_number +
                ", u_address='" + u_address + '\'' +
                '}';
    }
}
