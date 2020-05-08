package com.os.service;


import com.os.entity.Roleinfo;

import java.util.List;

/**
 * @author R
 * @date 2020/5/7 - 10:12
 */
public interface RoleinfoService {
    List<Roleinfo> selectAll();

    int deleteByPrimaryKey(Integer roleid);


    int insertSelective(Roleinfo record);

    Roleinfo selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Roleinfo record);
}
