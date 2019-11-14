package com.example.demo.test;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RequestMapping("/web")
@RestController
public class JpaTestDemo {
	Log log = LogFactory.getLog(JpaTestDemo.class);
	
	@Autowired
	private StudentService studentServiceImpl;
	
	@RequestMapping("/query")
	public void getTest() {
		List<Student> queryAll = studentServiceImpl.queryAll();
		for (Student student : queryAll) {
			System.out.println(JSONObject.toJSONString(student));
		}
		
		log.info("输出的日志信息是 ： "+JSONObject.toJSONString(queryAll));
	}

}
