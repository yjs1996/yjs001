/**
 * @(#)ServiceImpl.java
 * Description:	TODO ��д�ļ����ü�Ҫ˵��
 * Version :	0.0.0
 * Copyright:	Copyright (c) �������޶���Ϣ�Ƽ����޹�˾  ��Ȩ����
 * Create by:	���˶  2017��12��6��
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
 * TODO ��д����˵��
 * @author ���˶
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
