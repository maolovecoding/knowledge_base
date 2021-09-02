package com.mao.resp;

import lombok.*;

/**
 * @ClassName: EbookResp
 * @Description: 返回给前端的ebook实体类，进行了特殊字段的隐藏
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 19:57
 * @Version: v1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EbookResp {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
