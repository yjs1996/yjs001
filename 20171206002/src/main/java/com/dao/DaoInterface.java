/**
 * @(#)DaoInterface.java
 * Description:	TODO ��д�ļ����ü�Ҫ˵��
 * Version :	0.0.0
 * Copyright:	Copyright (c) �������޶���Ϣ�Ƽ����޹�˾  ��Ȩ����
 * Create by:	���˶  2017��12��6��
 */
package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.domain.User;

/**
 * TODO ��д����˵��
 * @author ���˶
 */
public interface DaoInterface {
	@Insert("insert into t_user values(#{uno},#{uname},#{password},#{truename})")
	public void save(User user);
}
