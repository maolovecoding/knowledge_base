package com.mao.service;

import com.mao.req.EbookReq;
import com.mao.resp.EbookResp;

import java.util.List;

/**
 * @ClassName: EbookService
 * @Description: TODO
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:20
 * @Version: v1.0
 */
public interface EbookService {
    /**
     * 获取所有表数据的业务层方法
     * @return
     */
    List<EbookResp> getAllEbook(EbookReq ebookReq);
}
