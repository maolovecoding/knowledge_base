package com.mao.controller;

import com.mao.bean.Test;
import com.mao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: TestController
 * @Description: test控制层测试
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:23
 * @Version: v1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/getList")
    public List<Test> getList() {
        return testService.getAllTest();
    }
}
