package com.mao.controller;


import com.mao.req.EbookReq;
import com.mao.resp.CommonResp;
import com.mao.resp.EbookResp;
import com.mao.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: EbookController
 * @Description: ebook控制层测试
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 17:23
 * @Version: v1.0
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    private EbookService ebookService;

    /**
     * 模糊查询，根据关键字 模糊查询电子书列表
     *
     * @return
     */
    @GetMapping("/getList")
    public CommonResp<List<EbookResp>> getList(EbookReq ebook) {
        // 返回的电子书的列表，全都用我们封装好的返回给前端的ebookResp类，不用出现对应数据库表的实体类
        List<EbookResp> list = ebookService.getAllEbook(ebook);
        CommonResp<List<EbookResp>> commonResp = new CommonResp<>();
        commonResp.setContent(list);
        return commonResp;
    }
}
