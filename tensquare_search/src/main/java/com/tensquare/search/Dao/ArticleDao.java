package com.tensquare.search.Dao;

import com.tensquare.search.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-13 11:41
 **/
public interface ArticleDao extends ElasticsearchRepository<Article,String> {

    public Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);

}
