package com.chen.service;

import lombok.Synchronized;
import org.springframework.stereotype.Service;

/**
 * description:
 * className:NumberService
 * author: chenqifan
 * date:2023/4/2020:53
 **/

@Service
public interface NumberService {
     String update(String name, int doctorId);
}
