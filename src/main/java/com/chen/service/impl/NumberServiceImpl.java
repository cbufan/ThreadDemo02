package com.chen.service.impl;

import com.chen.entity.NumberTb;
import com.chen.mapper.NumberMapper;
import com.chen.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description:
 * className:NumberService
 * author: chenqifan
 * date:2023/4/2020:53
 **/

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberMapper numberMapper;


    public String update(String name, int doctorId) {
        String s = txUpdate(name, doctorId);
        return s;
    }

    @Transactional
    public String txUpdate(String name, int doctorId){
        NumberTb numberTb = numberMapper.selectNumber(name, doctorId);
        if(numberTb.getTotal() - numberTb.getUsed() <=0) throw new RuntimeException("取号失败，没号了");
        int b = numberMapper.updateUse(name, doctorId);
        return b>=1?"取号成功:0"+(numberTb.getUsed()+1):"取号失败失败";
    }
}
