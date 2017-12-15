package com.jdbcTemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbcTemplate.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	/**
	 * 这里的rs代表：
	 * 当查询出总的结果集后,框架会自动遍历该结果集
	 * 每一次遍历的一行数据,都会被存放到这个方法的rs参数中
	 * 这里的rs代表的是一行数据,并非所有查询结果
	 * 只要能执行到这个方法就说明这里的rs不会是空的
	 */
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
