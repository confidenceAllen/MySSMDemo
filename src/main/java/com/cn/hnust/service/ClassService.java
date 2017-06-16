package com.cn.hnust.service;

import java.util.List;

import com.cn.hnust.pojo.Class;
import com.cn.hnust.pojo.Student;

public interface ClassService {
	public List<Student> getStudentlList(int classid);
	
	public Class getClazz(int classid);
}
