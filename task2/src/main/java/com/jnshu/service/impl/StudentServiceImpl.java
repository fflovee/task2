package com.jnshu.service.impl;

import com.jnshu.mapper.StudentDao;
import com.jnshu.pojo.Student;
import com.jnshu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student selStuByName(String name) {
        return studentDao.selectStudent(name);
    }
}
