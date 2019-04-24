package com.tensquare.base.Dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: Quan
 *
 * @program: tensquare_parent
 *
 * @description:
 *
 * @create: 2019-04-03 23:28
 **/
public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label>{
}
