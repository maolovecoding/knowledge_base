package com.mao.req;

import lombok.*;

/**
 * @ClassName: EbookReq
 * @Description: 封装前端请求参数的对象，ebook表用
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 19:50
 * @Version: v1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EbookReq {
    private Long id;

    private String name;
}
