package com.lou.mapper;

import com.lou.pojo.Sp;
import com.lou.pojo.SpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpMapper {
    int countByExample(SpExample example);

    int deleteByExample(SpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sp record);

    int insertSelective(Sp record);

    List<Sp> selectByExample(SpExample example);

    Sp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sp record, @Param("example") SpExample example);

    int updateByExample(@Param("record") Sp record, @Param("example") SpExample example);

    int updateByPrimaryKeySelective(Sp record);

    int updateByPrimaryKey(Sp record);
}