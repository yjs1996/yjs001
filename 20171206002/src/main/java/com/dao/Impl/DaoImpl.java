/**
 * @(#)DaoImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	杨金硕  2017年12月6日
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
 * dao顶repository
 * @author 杨金硕
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
