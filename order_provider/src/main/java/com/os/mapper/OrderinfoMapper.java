package com.os.mapper;

import com.os.entity.Orderinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderinfoMapper {
    List<Orderinfo> selectAll();

    int deleteByPrimaryKey(Integer orderid);


    int insertSelective(Orderinfo record);

    Orderinfo selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Orderinfo record);

}