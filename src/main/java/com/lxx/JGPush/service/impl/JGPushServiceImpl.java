package com.lxx.JGPush.service.impl;

import com.lxx.JGPush.service.JGPushService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Think on 2017/03/01.
 */
@Service
public class JGPushServiceImpl implements JGPushService {

    @Override
    public Map<String,Object> jgPush(){
        Map<String,Object> resultMap = new HashMap<>();
        return resultMap;
    }
    public static void main(String args[]){
        System.out.print("test");
    }
}


