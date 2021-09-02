package com.mao.mapper;

import com.mao.bean.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: TestMapper
 * @Description: test实体类的持久层测试
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:08
 * @Version: v1.0
 */
@Mapper
public interface TestMapper {
    /**
     * 测试，获取test表所有的数据
     * @return
     */
    List<Test> selectAll();
}
