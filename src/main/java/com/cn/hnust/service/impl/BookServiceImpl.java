package com.cn.hnust.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cn.hnust.entity.Book;
import com.cn.hnust.mapper.BookMapper;
import com.cn.hnust.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService{

}
