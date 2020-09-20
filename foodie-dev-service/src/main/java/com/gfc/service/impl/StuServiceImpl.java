package com.gfc.service.impl;

import com.gfc.mapper.StuMapper;
import com.gfc.pojo.Stu;
import com.gfc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/20 5:35 下午
 */
@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Stu getStuInfo(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveStu() {
        Stu stu = new Stu();
        stu.setName("李四");
        stu.setAge("20");
        stuMapper.insert(stu);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateStu(int id) {
        Stu stu = stuMapper.selectByPrimaryKey(id);
        stu.setName("王五");
        stu.setAge("30");
        stuMapper.updateByPrimaryKey(stu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteStu(int id) {
        stuMapper.deleteByPrimaryKey(id);
    }

    public void saveParent(){
        Stu stu = new Stu();
        stu.setName("parent");
        stu.setAge("50");
        stuMapper.insert(stu);
    }

    public void saveChildren(){
        saveChild1();
        int a = 1 / 0;
        savechild2();
    }

    public void saveChild1(){
        Stu stu = new Stu();
        stu.setName("child-1");
        stu.setAge("11");
        stuMapper.insert(stu);
    }

    public void savechild2(){
        Stu stu = new Stu();
        stu.setName("child-2");
        stu.setAge("12");
        stuMapper.insert(stu);
    }
}
