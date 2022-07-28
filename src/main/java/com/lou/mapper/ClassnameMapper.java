package com.lou.mapper;

import com.lou.pojo.Classname;
import com.lou.pojo.ClassnameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassnameMapper {
    int countByExample(ClassnameExample example);

    int deleteByExample(ClassnameExample example);

    int insert(Classname record);

    int insertSelective(Classname record);

    List<Classname> selectByExample(ClassnameExample example);

    int updateByExampleSelective(@Param("record") Classname record, @Param("example") ClassnameExample example);

    int updateByExample(@Param("record") Classname record, @Param("example") ClassnameExample example);
}