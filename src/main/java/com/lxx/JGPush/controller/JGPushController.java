package com.lxx.JGPush.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Think on 2017/03/01.
 */
@RestController
@RequestMapping(value = "/jg")
public class JGPushController {

    public Map<String,Object> jgPush(){
        Map<String,Object> result = new HashMap<String,Object>();
        return result;
    }
}
