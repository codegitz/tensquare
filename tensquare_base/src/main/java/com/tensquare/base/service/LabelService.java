package com.tensquare.base.service;

import com.tensquare.base.Dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Quan
 *
 * @program: tensquare_parent
 *
 * @description:
 *
 * @create: 2019-04-03 23:30
 **/
@Service
@Transactional
public class LabelService {

    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;
    /**
     *  查询全部标签
     *  @return
     */
    public List<Label> findAll(){
    return labelDao.findAll();
    }
    /**
     *  根据ID查询标签
     *  @return
     */
    public Label findById(String id){
        return labelDao.findById(id).get();
    }
    /**
     * 增加标签
     * @param label
     */
    public void add(Label label){
        label.setId( idWorker.nextId()+"" );//设置ID
        labelDao.save(label);
    }
    /**
     * 修改标签
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }
    /**
     * 删除标签
     * @param id
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

    public List<Label> findSearch(Label label) {
        return labelDao.findAll(new Specification<Label>() {
            /**
             *
             * @param root 根对象，也就是要把条件封装到哪个对象中， where 类名=label.getId
             * @param criteriaQuery 封装的都是查询的关键字，比如order by group by 等等
             * @param criteriaBuilder 用来封装条件对象的，如果直接返回null，表示不需要任何条件
             * @return
             */
            @Nullable
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //new一个list集合，来存放所有条件
                List<Predicate> list =new ArrayList<>();
                if (label.getLabelname()!=null && !"".equals(label.getLabelname())){
                    Predicate predicate=criteriaBuilder.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");//where labelname like %小明%
                    list.add(predicate);
                }
                if (label.getState()!=null && !"".equals(label.getState())){
                    Predicate predicate=criteriaBuilder.like(root.get("state").as(String.class),label.getState());//where labelname like %小明%
                    list.add(predicate);
                }
                //new 一个数组作为最终返回值的条件
                Predicate[] parr=new Predicate[list.size()];
                parr = list.toArray(parr);
                return criteriaBuilder.and(parr);
            }
        });
    }

    public Page<Label> queryPage(Label label, int page, int size) {
        //封装分页对象
        Pageable pageable = PageRequest.of(page-1,size);
        return labelDao.findAll(new Specification<Label>() {
            /**
             *
             * @param root 根对象，也就是要把条件封装到哪个对象中， where 类名=label.getId
             * @param criteriaQuery 封装的都是查询的关键字，比如order by group by 等等
             * @param criteriaBuilder 用来封装条件对象的，如果直接返回null，表示不需要任何条件
             * @return
             */
            @Nullable
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //new一个list集合，来存放所有条件
                List<Predicate> list =new ArrayList<>();
                if (label.getLabelname()!=null && !"".equals(label.getLabelname())){
                    Predicate predicate=criteriaBuilder.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");//where labelname like %小明%
                    list.add(predicate);
                }
                if (label.getState()!=null && !"".equals(label.getState())){
                    Predicate predicate=criteriaBuilder.like(root.get("state").as(String.class),label.getState());//where labelname like %小明%
                    list.add(predicate);
                }
                //new 一个数组作为最终返回值的条件
                Predicate[] parr=new Predicate[list.size()];
                parr = list.toArray(parr);
                return criteriaBuilder.and(parr);
            }
        }, pageable);
    }
}
