package com.tensquare.qa.client.impl;

import com.tensquare.qa.client.BaseClient;
import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-19 17:20
 **/
@Component
public class BaseClientImpl implements BaseClient {
    @Override
    public Result findById(String id) {
        return new Result(false, StatusCode.ERROR,"Internal Error.hystrix start....");
    }
}
