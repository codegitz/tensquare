package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description: 不喜欢列表
 * @create: 2019-04-19 00:33
 **/
public interface NoFriendDao extends JpaRepository<NoFriend,String> {

}
