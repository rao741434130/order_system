package com.os.mapper;


import com.os.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserinfoMapper {
    List<Userinfo> selectAll();

    Userinfo loginUser(Userinfo userinfo);

    int deleteByPrimaryKey(Integer userid);


    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Userinfo record);

}