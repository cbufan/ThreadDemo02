package com.chen.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * description:
 * className:NumberTb
 * author: chenqifan
 * date:2023/4/2019:47
 **/


@Data
public class NumberTb implements Serializable {
    private long id;
    private String type;
    private long doctorId;
    private int total;
    private int used;
}
