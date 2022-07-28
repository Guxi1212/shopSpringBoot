package com.lou.mapper;

import com.lou.pojo.Gys;
import com.lou.pojo.GysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GysMapper {
    int countByExample(GysExample example);

    int deleteByExample(GysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gys record);

    int insertSelective(Gys record);

    List<Gys> selectByExample(GysExample example);

    Gys selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gys record, @Param("example") GysExample example);

    int updateByExample(@Param("record") Gys record, @Param("example") GysExample example);

    int updateByPrimaryKeySelective(Gys record);

    int updateByPrimaryKey(Gys record);
}