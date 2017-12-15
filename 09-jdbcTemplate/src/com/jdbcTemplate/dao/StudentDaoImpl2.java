/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：IStudentDao接口实现类
 */

package com.jdbcTemplate.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.jdbcTemplate.beans.Student;

//代码不能写为下面的形式
public class StudentDaoImpl2 extends JdbcDaoSupport implements IStudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public StudentDaoImpl2() {
		super();
		jdbcTemplate=jdbcTemplate;
	}

	@Override
	public void insertStudent(Student student) {

		String sql="insert into student(name,age) values(?,?)";
		jdbcTemplate.update(sql, student.getName(), student.getAge());
	}
	
	@Override
	public void deleteById(int id) {
		String sql="delete from student where id=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void updateStudent(Student student) {

		String sql="update student set name=?,age=? where id=?";
		jdbcTemplate.update(sql, student.getName(), student.getAge(), student.getId());
	}

	@Override
	public List<String> selectAllStudentNames() {
		String sql="select name from student";
		return jdbcTemplate.queryForList(sql, String.class);
	}
	
	@Override
	public String selectStudentNameById(int id) {
		String sql="select name from student where id=?";
		Object[] parameters={id};
		return jdbcTemplate.queryForObject(sql, parameters, String.class);
		//或下面这段语句也可
		//return jdbcTemplate.queryForObject(sql, String.class, id);
	}

	@Override
	public List<Student> selectAllStudents() {
		String sql="select id,name,age from student";
		return jdbcTemplate.query(sql, new StudentRowMapper());
	}

	@Override
	public Student selectStudentById(int id) {
		String sql="select id,name,age from student where id=?";
		List<Student> students=jdbcTemplate.query(sql, new StudentRowMapper(), id);
		if(students.size()==0){
			return null;
		}else{
			return students.get(0);
		}
		
	}

}
