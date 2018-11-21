package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.service.UniversityService;

import java.util.LinkedList;
import java.util.List;

public class UniversityServiceImpl implements UniversityService {

    private static  final List<University> universityList = new LinkedList<>();

    @Override
    public University getByUniversityIdx(int universityIdx) {
        for(University u : universityList){
            if(u.getU_idx() == universityIdx){
                return u;
            }
        }

        return null;
    }
}
