package com.example.wiki_project.mapper;

import com.example.wiki_project.domain.Ebook;
import com.example.wiki_project.domain.EbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface EbookMapper {
    //	按条件计数
    long countByExample(EbookExample example);


    int deleteByExample(EbookExample example);
    //	按主键删除
    int deleteByPrimaryKey(Long id);
    //插入数据
    int insert(Ebook record);
    //根据数据不为空选择性插入
    int insertSelective(Ebook record);
    //查询所有数据 并且可以根据设置选择是否去重与排序
    List<Ebook> selectByExample(EbookExample example);

    Ebook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByExample(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}