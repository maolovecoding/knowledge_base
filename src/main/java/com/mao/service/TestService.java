package com.mao.service;

import com.mao.bean.Test;

import java.util.List;

/**
 * @ClassName: TestService
 * @Description: TODO
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:20
 * @Version: v1.0
 */
public interface TestService {
    /**
     * 获取所有test表数据的业务层方法测试
     * @return
     */
    List<Test> getAllTest();
}
