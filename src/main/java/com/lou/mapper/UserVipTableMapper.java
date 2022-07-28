package com.lou.mapper;

import com.lou.pojo.UserVipTable;
import com.lou.pojo.UserVipTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVipTableMapper {
    int countByExample(UserVipTableExample example);

    int deleteByExample(UserVipTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserVipTable record);

    int insertSelective(UserVipTable record);

    List<UserVipTable> selectByExample(UserVipTableExample example);

    UserVipTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserVipTable record, @Param("example") UserVipTableExample example);

    int updateByExample(@Param("record") UserVipTable record, @Param("example") UserVipTableExample example);

    int updateByPrimaryKeySelective(UserVipTable record);

    int updateByPrimaryKey(UserVipTable record);
}