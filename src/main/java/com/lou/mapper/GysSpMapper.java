package com.lou.mapper;

import com.lou.pojo.GysSp;
import com.lou.pojo.GysSpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GysSpMapper {
    int countByExample(GysSpExample example);

    int deleteByExample(GysSpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GysSp record);

    int insertSelective(GysSp record);

    List<GysSp> selectByExample(GysSpExample example);

    GysSp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GysSp record, @Param("example") GysSpExample example);

    int updateByExample(@Param("record") GysSp record, @Param("example") GysSpExample example);

    int updateByPrimaryKeySelective(GysSp record);

    int updateByPrimaryKey(GysSp record);
}