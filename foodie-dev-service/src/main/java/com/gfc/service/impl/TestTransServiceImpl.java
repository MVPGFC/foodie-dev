package com.gfc.service.impl;

import com.gfc.mapper.StuMapper;
import com.gfc.service.StuService;
import com.gfc.service.TestTransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/20 9:31 下午
 */
@Service
public class TestTransServiceImpl implements TestTransService {

    @Autowired
    private StuService stuService;

    @Override
    public void testPropagationTrans() {
        stuService.saveParent();
        stuService.saveChildren();
    }
}
