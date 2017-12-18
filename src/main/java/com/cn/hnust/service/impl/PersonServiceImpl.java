package com.cn.hnust.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cn.hnust.entity.Person;
import com.cn.hnust.mapper.PersonDao;
import com.cn.hnust.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 人类 服务实现类
 * </p>
 *
 * @author by
 * @since 2017-12-18
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

}
