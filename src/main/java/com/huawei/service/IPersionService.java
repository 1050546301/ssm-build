package com.huawei.service;

import java.util.List;

import com.huawei.model.Persion;

public interface IPersionService {
    /**
     * 加载全部的person
     * @return
     */
    List<Persion> loadPersons();
}
