package com.lou.mapper;

import com.lou.pojo.Userdata;
import com.lou.pojo.UserdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserdataMapper {
    int countByExample(UserdataExample example);

    int deleteByExample(UserdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userdata record);

    int insertSelective(Userdata record);

    List<Userdata> selectByExample(UserdataExample example);

    Userdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByExample(@Param("record") Userdata record, @Param("example") UserdataExample example);

    int updateByPrimaryKeySelective(Userdata record);

    int updateByPrimaryKey(Userdata record);
}