package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: Quan
 * @program: tensquare_parent
 * @description:
 * @create: 2019-04-11 13:31
 **/
public interface SpitDao extends MongoRepository<Spit,String>{

    public Page<Spit> findByParentid(String parentid, Pageable pageable);

}
