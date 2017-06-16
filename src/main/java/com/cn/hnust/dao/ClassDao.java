package com.cn.hnust.dao;

import com.cn.hnust.pojo.Class;

public interface ClassDao {
    int deleteByPrimaryKey(Integer classid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}