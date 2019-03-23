package com.huawei.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.huawei.model.Persion;

public interface PersionMapper {
    /**
     * 插入一条记录
     * @param person
     */
    void insert(Persion person);
    
    /**
     * 查询所有
     * @return
     */
    List<Persion> queryAll();
}
