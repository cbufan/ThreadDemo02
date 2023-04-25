package com.chen.mapper;

import com.chen.entity.NumberTb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface NumberMapper {
    public int updateUse(@Param("name") String name, @Param("doctorId") long doctorId);

    public NumberTb selectNumber(@Param("name") String name, @Param("doctorId") long doctorId);
}
