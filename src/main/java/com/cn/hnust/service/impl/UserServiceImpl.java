 package com.cn.hnust.service.impl;

 import com.cn.hnust.entity.User;
 import com.cn.hnust.mapper.UserDao;
 import com.cn.hnust.service.UserService;
 import org.springframework.stereotype.Service;

 import javax.annotation.Resource;
  
@Service
public class UserServiceImpl implements UserService {
    @Resource  
    private UserDao userDao;  
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
  