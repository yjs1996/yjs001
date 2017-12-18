/**
 * @(#)DaoImpl.java
 * Description:	TODO ��д�ļ����ü�Ҫ˵��
 * Version :	0.0.0
 * Copyright:	Copyright (c) �������޶���Ϣ�Ƽ����޹�˾  ��Ȩ����
 * Create by:	���˶  2017��12��6��
 */
package com.dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.DaoInterface;
import com.domain.User;
import com.service.Impl.ServiceImpl;

/**
 * dao��repository
 * @author ���˶
 */
@Repository
public class DaoImpl extends SqlSessionDaoSupport implements DaoInterface{
	@Autowired
	public void setFactory(SqlSessionFactory factory){
		super.setSqlSessionFactory(factory);
	}
	
	@Override
	public void save(User user) {
		SqlSession session = this.getSqlSession();
		session.insert("com.dao.DaoInterface.save",user);
	}
	
	
}
