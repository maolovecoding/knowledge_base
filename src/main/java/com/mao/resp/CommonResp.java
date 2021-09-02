package com.mao.resp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @ClassName: CommonResp
 * @Description: 通用返回类，用于返回给前端页面一个统一的结果
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 19:34
 * @Version: v1.0
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonResp<T> {

    /**
     * 业务上的成功或失败
     */
    private boolean success = true;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回泛型数据，自定义类型
     */
    private T content;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResponseDto{");
        sb.append("success=").append(success);
        sb.append(", message='").append(message).append('\'');
        sb.append(", content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}