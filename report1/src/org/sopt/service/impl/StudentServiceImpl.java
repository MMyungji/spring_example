package org.sopt.service.impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

import java.util.LinkedList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private static final List<Student> studentList = new LinkedList<>();

    @Override
    public Student getByStudentIdx(int studentIdx) {
        for(Student s : studentList){
            if(s.getS_idx() == studentIdx){
                return s;
            }
        }
        return null;
    }
}
