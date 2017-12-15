package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.ClassDao;
import com.cn.hnust.entity.Class;
import com.cn.hnust.entity.Student;
import com.cn.hnust.service.ClassService;

@Service("classService")
public class ClassServiceImpl implements ClassService{

	@Resource
	private ClassDao classDao;
	
	@Override
	public List<Student> getStudentlList(int classid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getClazz(int classid) {
		// TODO Auto-generated method stub
		return classDao.selectByPrimaryKey(classid);
	}
	
	

}
