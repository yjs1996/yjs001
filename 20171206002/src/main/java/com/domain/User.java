/**
 * @(#)User.java
 * Description:	TODO ��д�ļ����ü�Ҫ˵��
 * Version :	0.0.0
 * Copyright:	Copyright (c) �������޶���Ϣ�Ƽ����޹�˾  ��Ȩ����
 * Create by:	���˶  2017��12��6��
 */
package com.domain;

import java.io.Serializable;

/**
 * TODO ��д����˵��
 * @author ���˶
 */
public class User implements Serializable{
	/**
	 * TODO ��дע��
	 */
	private static final long serialVersionUID = 1L;
	private Integer uno;
	private String uname;
	private String password;
	private String truename;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uno
	 * @param uname
	 * @param password
	 * @param truename
	 */
	public User(Integer uno, String uname, String password, String truename) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.password = password;
		this.truename = truename;
	}
	/**
	 * @return the uno
	 */
	public Integer getUno() {
		return uno;
	}
	/**
	 * @param uno the uno to set
	 */
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the truename
	 */
	public String getTruename() {
		return truename;
	}
	/**
	 * @param truename the truename to set
	 */
	public void setTruename(String truename) {
		this.truename = truename;
	}
	
}
