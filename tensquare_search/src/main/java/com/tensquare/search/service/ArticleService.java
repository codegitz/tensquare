package com.tensquare.search.service;

import com.tensquare.search.Dao.ArticleDao;
import com.tensquare.search.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-13 11:42
 **/
@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;
    /**
     * 增加文章
     * @param article
     */
    public void add(Article article){
        articleDao.save(article);
    }

    public Page<Article> findByKey(String key, int page, int size) {
        Pageable pageable= PageRequest.of(page-1,size);
        return  articleDao.findByTitleOrContentLike(key,key,pageable);
    }
}
