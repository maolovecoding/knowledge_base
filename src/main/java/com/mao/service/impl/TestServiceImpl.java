package com.mao.service.impl;

import com.mao.bean.Test;
import com.mao.mapper.TestMapper;
import com.mao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: TestServiceImpl
 * @Description: TODO
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:22
 * @Version: v1.0
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> getAllTest() {
        return testMapper.selectAll();
    }
}
