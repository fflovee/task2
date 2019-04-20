package com.jnshu.mapper;

import com.jnshu.pojo.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface StudentDao {
    Student selectStudent(String name);
}
