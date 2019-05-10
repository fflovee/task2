package com.jnshu.service.impl;

import com.jnshu.mapper.StudentDao;
import com.jnshu.pojo.Student;
import com.jnshu.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    private Logger log = LogManager.getLogger(StudentServiceImpl.class);

    @Override
    public Student selStuById(Integer id) {
        return studentDao.selStuById(id);

    }

    @Override
    public void delStuById(Integer id) {
        studentDao.delStuById(id);
    }

    @Override
    public List<Student> getStudent() {
        return studentDao.selStuList();
    }

    @Override
    public List<Student> getStuByChoose() {
        return studentDao.selStuByChoose();
    }

    @Override
    public Boolean upStuById(Student student) {
        return studentDao.updateStu(student);
    }

    @Override
    public Boolean upStu(Long id, String key, Object value) {
        try {
            studentDao.updateStudent(id,key,value);
            return true;
        }catch (Exception e) {
            log.info(e);
            return false;
        }
    }

    @Override
    public void insStu(Student student) {
        studentDao.insertStu(student);
    }

}

