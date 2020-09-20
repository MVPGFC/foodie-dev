package com.test;

import com.gfc.Application;
import com.gfc.service.StuService;
import com.gfc.service.TestTransService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/20 9:17 下午
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TransTest {
    @Autowired
    private StuService stuService;

    @Autowired
    private TestTransService testTransService;

    @Test
    public void Mytest(){
        testTransService.testPropagationTrans();
    }

}
