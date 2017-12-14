package com.cn.hnust.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cn.hnust.dao.BookMapper;
import com.cn.hnust.pojo.Book;
import com.cn.hnust.service.BookService;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService{

}