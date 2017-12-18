/**
 * @(#)ActionImpl.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	杨金硕  2017年12月6日
 */
package com.action.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.domain.User;
import com.service.ServiceInterface;
import com.service.Impl.ServiceImpl;



/**
 * TODO 填写功能说明
 * @author 杨金硕
 */
@Controller
public class ActionImpl{
	@Autowired
	private ServiceInterface service;
	
	@RequestMapping("/updata.do")
	public void save(MultipartFile excel) throws Exception{
		List<User> users = new ArrayList<User>();
		Workbook book = WorkbookFactory.create(excel.getInputStream());
		Sheet sheet = book.getSheetAt(0);
		for(int i =1;i<sheet.getLastRowNum();i++){
			Row row = sheet.getRow(i);
			Cell c1 = row.getCell(0);
			Cell c2 = row.getCell(1);
			Cell c3 = row.getCell(2);
			Cell c4 = row.getCell(3);
			
			int uno = (int) c1.getNumericCellValue();
			String uname = c2.getStringCellValue();
			String password = String.valueOf((int)c3.getNumericCellValue());
			String truename = c4.getStringCellValue();
			User user = new User(uno,uname,password,truename);
			users.add(user);
		}
		service.save(users);
	}

}
