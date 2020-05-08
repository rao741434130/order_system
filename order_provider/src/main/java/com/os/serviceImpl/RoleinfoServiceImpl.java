package com.os.serviceImpl;

import com.os.entity.Roleinfo;
import com.os.mapper.RoleinfoMapper;
import com.os.service.RoleinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author R
 * @date 2020/5/7 - 11:13
 */
@Service
public class RoleinfoServiceImpl implements RoleinfoService {

    @Autowired
    private RoleinfoMapper roleinfoMapper;
    @Override
    public List<Roleinfo> selectAll() {
        return roleinfoMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer roleid) {
        return roleinfoMapper.deleteByPrimaryKey(roleid);
    }

    @Override
    public int insertSelective(Roleinfo record) {
        return roleinfoMapper.insertSelective(record);
    }

    @Override
    public Roleinfo selectByPrimaryKey(Integer roleid) {
        return roleinfoMapper.selectByPrimaryKey(roleid);
    }

    @Override
    public int updateByPrimaryKeySelective(Roleinfo record) {
        return roleinfoMapper.updateByPrimaryKeySelective(record);
    }
}
