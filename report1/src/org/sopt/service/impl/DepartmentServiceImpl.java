package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.service.DepartmentService;

import java.util.LinkedList;
import java.util.List;


public class DepartmentServiceImpl implements DepartmentService {

    private static final List<Department> departmentList = new LinkedList<>();

    @Override
    public Department getByDepartmentIdx(int departmentIdx) {
        for(Department d : departmentList){
            if(d.getD_idx() == departmentIdx){
                return d;
            }
        }
        return null;
    }
}
