package com.cn.hnust.pojo;

import com.baomidou.mybatisplus.annotations.TableName;

@TableName("book")
public class Book {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
