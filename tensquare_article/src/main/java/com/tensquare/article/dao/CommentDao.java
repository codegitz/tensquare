package com.tensquare.article.dao;

import com.tensquare.article.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description: 文章评论dao
 * @create: 2019-04-12 19:51
 **/
public interface CommentDao extends MongoRepository<Comment,String>{
    /**
     * 根据文章ID查询评论列表
     * @param articleid
     * @return
     */
    public List<Comment> findByArticleid(String articleid);

}
