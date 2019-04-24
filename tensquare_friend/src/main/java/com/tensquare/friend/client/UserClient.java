package com.tensquare.friend.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description: 调用用户客户端
 * @create: 2019-04-19 00:41
 **/
@FeignClient("tensquare-user")
public interface UserClient {

    /**
     * 增加粉丝数
     * @param
     * @param x
     */
    @RequestMapping(value = "/user/incfans/{userid}/{x}",method = RequestMethod.POST)
    public void incFanscount (@PathVariable("userid") String userId,@PathVariable("x") int x);

    /**
     * 增加关注数
     * @param userid
     * @param x
     */
    @RequestMapping(value="/user/incfollow/{userid}/{x}",method= RequestMethod.POST)
    public void incFollowcount(@PathVariable("userid") String userid,@PathVariable("x") int x);
}
