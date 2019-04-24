package com.tensquare.qa.client;

import com.tensquare.qa.client.impl.BaseClientImpl;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-18 00:27
 **/
@FeignClient(value = "tensquare-base",fallback = BaseClientImpl.class)
public interface BaseClient {
    @RequestMapping(value="/label/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id);
}
