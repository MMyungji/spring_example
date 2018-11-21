package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // 제네릭 사용해 학생타입 ArrayList 생성
        final ArrayList<Student> studentList = new ArrayList<>();

        //3개의 학생 객체 생성
        final Student student1 = new Student(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",02111111,"공대",123,"배다슬",2,"컴퓨터학과","ds@sopt","어디어디",23,"재학");
        final Student student2 = new Student(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",02111111,"공대",1234,"이충엽",3,"컴퓨터학과","cy@sopt","어디어디",43,"휴학");
        final Student student3 = new Student(1,"솝트대학교",11111111,"어기어디어디",2,"정보보안학과",02111112,"공대",1223,"박채원",1,"정보보안","cy2@sopt","어디어디",20,"재학");

        //객체 Add
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //ArrayList를 돌명서 각 객체의 toString메소드 실행
        for(final Student s : studentList){
            System.out.println(s.toString());
        }

        final ArrayList<Department> departmentList = new ArrayList<>();

        final Department department1 = new Department(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",021111111,"공대");
        final Department department2 = new Department(1,"솝트대학교",11111111,"어기어디어디",2,"정보보안학과",021111112,"공대");
        final Department department3 = new Department(1,"솝트대학교",11111111,"어기어디어디",3,"소프트웨어학과",021111113,"공대");

        //객체 Add
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);

        //ArrayList를 돌명서 각 객체의 toString메소드 실행
        for(final Department d : departmentList){
            System.out.println(d.toString());
        }

        final ArrayList<University> universityList = new ArrayList<>();

        final University university1 = new University(1,"솝트대학교",11111111,"어기어디어디");
        final University university2 = new University(2,"서버대학교",11111122,"어기어디서버");
        final University university3 = new University(3,"안드대학교",11111133,"어기어디안디");

        //객체 Add
        universityList.add(university1);
        universityList.add(university2);
        universityList.add(university3);

        //ArrayList를 돌명서 각 객체의 toString메소드 실행
        for(final University u : universityList){
            System.out.println(u.toString());
        }


        final ArrayList<Professor> professorList = new ArrayList<>();

        final Professor professor1 = new Professor(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",02111111,"공대",1,"이람다","컴퓨터학과",010111222,"인공지능");
        final Professor professor2 = new Professor(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",02111111,"공대",2,"김이투","소프트웨어학과",0101114433,"임베디드");
        final Professor professor3 = new Professor(1,"솝트대학교",11111111,"어기어디어디",1,"컴퓨터학과",02111111,"공대",3,"황초롱","정보보안학과",0101115544,"정보보안");
        //객체 Add
        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);

        //ArrayList를 돌명서 각 객체의 toString메소드 실행
        for(final Professor p : professorList){
            System.out.println(p.toString());
        }
    }
}
