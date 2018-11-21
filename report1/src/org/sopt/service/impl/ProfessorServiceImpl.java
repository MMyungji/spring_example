package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.service.ProfessorService;

import java.util.LinkedList;
import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {

    private static final List<Professor> professorList = new LinkedList<>();
    @Override
    public Professor getByProfessorIdx(int prodessorIdx) {
        for(Professor p :professorList){
            if(p.getP_idx() == prodessorIdx){
                return p;
            }
        }
        return null;
    }
}
