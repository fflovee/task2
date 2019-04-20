package com.jnshu.service;

import com.jnshu.pojo.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student selStuByName(String name);
}
