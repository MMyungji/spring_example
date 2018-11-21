package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {
    private int s_idx;
    private String s_name;
    private int s_year;
    private String s_dept;
    private  String s_email;
    private String s_address;
    private int s_age;
    private String s_state;

    public StudentBuilder setIdx(int s_idx) {
        this.s_idx = s_idx;
        return this;
    }

    public StudentBuilder setName(String s_name) {
        this.s_name = s_name;
        return this;
    }

    public StudentBuilder setS_year(int s_year) {
        this.s_year = s_year;
        return this;
    }

    public StudentBuilder setS_dept(String s_dept) {
        this.s_dept = s_dept;
        return this;
    }

    public StudentBuilder setS_email(String s_email) {
        this.s_email = s_email;
        return this;
    }

    public StudentBuilder setS_address(String s_address) {
        this.s_address = s_address;
        return this;
    }

    public StudentBuilder setS_age(int s_age) {
        this.s_age = s_age;
        return this;
    }

    public StudentBuilder setS_state(String s_state) {
        this.s_state = s_state;
        return this;
    }


}
