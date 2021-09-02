package com.mao.service.impl;

import com.mao.bean.Ebook;
import com.mao.bean.EbookExample;
import com.mao.mapper.EbookMapper;
import com.mao.req.EbookReq;
import com.mao.resp.EbookResp;
import com.mao.service.EbookService;
import com.mao.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: EbookServiceImpl
 * @Description: TODO
 * @Author 毛毛
 * @CreateDate 2021/09/02/周四 19:17
 * @Version: v1.0
 */
@Service
public class EbookServiceImpl implements EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    /**
     * 模糊查询电子书
     *
     * @return
     */
    @Override
    public List<EbookResp> getAllEbook(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        // 这个方法可以理解为where条件
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        // 模糊查询
        criteria.andNameLike("%" + ebookReq.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        // 将查询到的ebook列表，将都转为 ebookResp类型
        // List<EbookResp> list = new LinkedList<>();
        // ebookList.forEach(ebook -> {
        //     // EbookResp ebookResp = new EbookResp();

        //     // 使用springboot提供的工具类，完成类属性的拷贝
        //     // 将第一个类对象的属性值 拷贝到第一个类对象的属性上
        //     // BeanUtils.copyProperties(ebook, ebookResp);
        //
        //     // TODO  这里使用的我们封装好的工具类
        //     list.add(CopyUtil.copy(ebook, EbookResp.class));
        // });
        // return list;

        // TODO 这里使用的我们封装好的工具类 直接拷贝整个列表，将列表元素的属性值全都拷贝到新列表对象的属性上

        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
