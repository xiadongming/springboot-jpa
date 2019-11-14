package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="mystudent")
public class Student {
	
	@Id
	@GeneratedValue//自动生成，设置主键的生成策略，这种方式依赖于具体的数据库，如果数据库不支持自增主键，那么这个类型是没法用的。
	private Integer id;
	
	@Column(name="name")
	private String name;

	@Column(name="age")
    private Integer age;
	
	@Transient//表示该属性并非一个到数据库表的字段的映射,ORM框架将忽略该属性. 如果一个属性并非数据库表的字段映射,就务必将其标示为 @Transient ,否则,ORM框架默认其注 解为 @Basic
	private String addRess;  //表示一个简单的属性到数据库表的字段的映射,对于没有任何标注的getXxxx()方法,默认 即为 @Basic fetch: 表示该属性的读取策略,有EAGER和LAZY两种,分别表示主支抓取和延迟加载,默认为EAGER.

	
	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
