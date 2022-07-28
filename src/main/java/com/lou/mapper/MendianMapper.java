package com.lou.mapper;

import com.lou.pojo.Mendian;
import com.lou.pojo.MendianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MendianMapper {
    int countByExample(MendianExample example);

    int deleteByExample(MendianExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Mendian record);

    int insertSelective(Mendian record);

    List<Mendian> selectByExample(MendianExample example);

    Mendian selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Mendian record, @Param("example") MendianExample example);

    int updateByExample(@Param("record") Mendian record, @Param("example") MendianExample example);

    int updateByPrimaryKeySelective(Mendian record);

    int updateByPrimaryKey(Mendian record);
}