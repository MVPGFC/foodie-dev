package com.gfc.service;

import com.gfc.mapper.StuMapper;
import com.gfc.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/20 5:35 下午
 */
public interface StuService {

    Stu getStuInfo(int id);
    void saveStu();
    void updateStu(int id);
    void deleteStu(int id);

    void saveParent();
    void saveChildren();

}
