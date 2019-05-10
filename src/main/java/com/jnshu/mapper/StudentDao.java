package com.jnshu.mapper;

import com.jnshu.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    //根据id查询学员
    Student selStuById(Integer id);
    //删除学员信息
    void delStuById(Integer id);
    //查询所有学员信息
    List<Student> selStuList();
    //选择条件查询
    List<Student> selStuByChoose();
    //更新学员信息
    Boolean updateStu(Student student);
    //添加学员信息
    void insertStu(Student student);
    //更新学员信息
    void updateStudent(@Param("id") Long id,
                       @Param("key") String key,
                       @Param("value") Object value);
}
