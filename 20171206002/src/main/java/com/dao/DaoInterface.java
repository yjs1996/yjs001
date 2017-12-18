/**
 * @(#)DaoInterface.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	杨金硕  2017年12月6日
 */
package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import com.domain.User;

/**
 * TODO 填写功能说明
 * @author 杨金硕
 */
public interface DaoInterface {
	@Insert("insert into t_user values(#{uno},#{uname},#{password},#{truename})")
	public void save(User user);
}
