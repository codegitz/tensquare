package com.tensquare.spit.controller;

import com.tensquare.spit.pojo.Spit;
import com.tensquare.spit.service.SpitService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import util.JwtUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-11 13:37
 **/

@RestController
@CrossOrigin
@RequestMapping("/spit")
public class SpitController {

    @Autowired
    private SpitService spitService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private HttpServletRequest httpServletRequest;

    /**
     * 查询全部数据
     * @return
     */
    @RequestMapping(method= RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",spitService.findAll());
    }

    /**
     * 根据ID查询
     * @param id ID
     * @return
     */
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Result findOne(@PathVariable String id){
        return new Result(true,StatusCode.OK,"查询成功",spitService.findById(id));
    }

    /**
     * 增加
     * @param spit
     */
    @RequestMapping(method=RequestMethod.POST)
    public Result add(@RequestBody Spit spit ){
        Claims claims_user = (Claims) httpServletRequest.getAttribute("claims_user");
        if(claims_user==null){
            return new Result(false,StatusCode.ACCESSERROR,"权限不足！请登录！");
        }
        spit.setUserid(claims_user.getId());
        spitService.add(spit);
        return new Result(true,StatusCode.OK,"增加成功");
    }

    /** 修改
     * @param spit
     */
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public Result update(@RequestBody Spit spit,@PathVariable String id ){
        Claims claims_user = (Claims) httpServletRequest.getAttribute("claims_user");
        if(claims_user==null){
            return new Result(false,StatusCode.ACCESSERROR,"权限不足！请登录！");
        }
        spit.set_id(id);
        spitService.update(spit);
        return new Result(true, StatusCode.OK,"修改成功");
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id ){
        Claims claims_user = (Claims) httpServletRequest.getAttribute("claims_user");
        if(claims_user==null){
            return new Result(false,StatusCode.ACCESSERROR,"权限不足！请登录！");
        }
        spitService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    @RequestMapping(value="/comment/{parentId}/{page}/{size}",method=RequestMethod.GET)
    public Result findByParentid(@PathVariable  String parentId,@PathVariable int page,@PathVariable int size ){
        Page<Spit> pageData = spitService.findByParentid(parentId, page, size);
        return new Result(true,StatusCode.OK,"查询成功",new PageResult<Spit>(pageData.getTotalElements(),pageData.getContent()));
    }

    /**
     * 点赞
     * @param id
     * @return
     */
    @RequestMapping(value="/thumbup/{id}",method=RequestMethod.PUT)
    public Result updateThumbup(@PathVariable String id){
        String userId="11";
        if(redisTemplate.opsForValue().get("thumbup_"+userId)!=null){
            return new Result(false,StatusCode.REPERROR,"不能重复点赞");
        }
        spitService.updateThumbup(id);
        redisTemplate.opsForValue().set("thumbup_"+userId,"1");
        return new Result(true,StatusCode.OK,"点赞成功");
    }
}
