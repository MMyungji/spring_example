package org.sopt.model;

public class Student extends Department {
    private int s_idx;
    private String s_name;
    private int s_year;
    private String s_dept;
    private  String s_email;
    private String s_address;
    private int s_age;
    private String s_state;

    public Student(int u_idx, String u_name, int u_number, String u_address, int d_idx, String d_name, int d_number, String d_type, int s_idx, String s_name, int s_year, String s_dept, String s_email, String s_address, int s_age, String s_state) {
        super(u_idx, u_name, u_number, u_address, d_idx, d_name, d_number, d_type);
        this.s_idx = s_idx;
        this.s_name = s_name;
        this.s_year = s_year;
        this.s_dept = s_dept;
        this.s_email = s_email;
        this.s_address = s_address;
        this.s_age = s_age;
        this.s_state = s_state;
    }


    public int getS_idx() {
        return s_idx;
    }

    public String getS_name() {
        return s_name;
    }

    public int getS_year() {
        return s_year;
    }

    public String getS_dept() {
        return s_dept;
    }

    public String getS_email() {
        return s_email;
    }

    public String getS_address() {
        return s_address;
    }

    public int getS_age() {
        return s_age;
    }

    public String getS_state() {
        return s_state;
    }

    public void setS_idx(int s_idx) {
        this.s_idx = s_idx;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setS_year(int s_year) {
        this.s_year = s_year;
    }

    public void setS_dept(String s_dept) {
        this.s_dept = s_dept;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public void setS_state(String s_state) {
        this.s_state = s_state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_idx=" + s_idx +
                ", s_name='" + s_name + '\'' +
                ", s_year=" + s_year +
                ", s_dept='" + s_dept + '\'' +
                ", s_email='" + s_email + '\'' +
                ", s_address='" + s_address + '\'' +
                ", s_age=" + s_age +
                ", s_state='" + s_state + '\'' +
                '}';
    }
}
