package com.os.mapper;

import com.os.entity.Roleinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleinfoMapper {
    List<Roleinfo> selectAll();

    int deleteByPrimaryKey(Integer roleid);


    int insertSelective(Roleinfo record);

    Roleinfo selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Roleinfo record);

}