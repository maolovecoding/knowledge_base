package com.mao.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CopyUtil
 * @Description: 实现对象的单体复制和列表复制，将源对象的属性值拷贝到新对象的属性上
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 20:10
 * @Version: v1.0
 */
public class CopyUtil {
    /**
     * 单体复制
     */
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source, obj);
        return obj;
    }

    /**
     * 列表复制
     */
    public static <T> List<T> copyList(List source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)) {
            for (Object c : source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }
}
