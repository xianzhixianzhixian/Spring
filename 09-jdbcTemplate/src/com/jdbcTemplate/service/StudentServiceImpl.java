/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：IStudentService接口实现类
 */

package com.jdbcTemplate.service;

import java.util.List;

import com.jdbcTemplate.beans.Student;
import com.jdbcTemplate.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao dao; //Student的DAO
	
	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	public void removeById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public List<String> findAllStudentNames() {
		return dao.selectAllStudentNames();
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.selectAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

}