package com.jnshu.service;

import com.jnshu.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student selStuById(Integer id);

    void delStuById(Integer id);

    List<Student> getStudent();

    Boolean upStuById(Student student);

    void insStu(Student student);

    List<Student> getStuByChoose();

    Boolean upStu(Long id , String key , Object value);

}
