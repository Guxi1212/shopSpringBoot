package com.lou.mapper;

import com.lou.pojo.VipTable;
import com.lou.pojo.VipTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipTableMapper {
    int countByExample(VipTableExample example);

    int deleteByExample(VipTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VipTable record);

    int insertSelective(VipTable record);

    List<VipTable> selectByExample(VipTableExample example);

    VipTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VipTable record, @Param("example") VipTableExample example);

    int updateByExample(@Param("record") VipTable record, @Param("example") VipTableExample example);

    int updateByPrimaryKeySelective(VipTable record);

    int updateByPrimaryKey(VipTable record);
}