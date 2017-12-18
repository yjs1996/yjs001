/**
 * @(#)ServiceImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	杨金硕  2017年12月6日
 */
package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DaoInterface;
import com.dao.Impl.DaoImpl;
import com.domain.User;
import com.service.ServiceInterface;

/**
 * TODO 填写功能说明
 * @author 杨金硕
 */
@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
	private DaoInterface dao;
	@Override
	@Transactional(isolation=Isolation.SERIALIZABLE,rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void save(List<User> users) {
		for(User user:users){
		dao.save(user);
		}
	}
	
}
