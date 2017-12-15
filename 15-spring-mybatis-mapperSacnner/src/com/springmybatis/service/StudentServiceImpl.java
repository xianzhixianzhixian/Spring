/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：IStudentService接口实现类
 */

package com.springmybatis.service;

import java.util.ArrayList;
import java.util.List;

import com.springmybatis.beans.Student;
import com.springmybatis.dao.IStudentDao;

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

	public List<String> findAllStudentNames() {
		
		List<Student> students=this.findAllStudents();
		List<String> names=new ArrayList<String>();
		for(Student student : students){
			names.add(student.getName());
		}
		return names;
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

	public String findStudentNameById(int id) {
		Student student=this.findStudentById(id);
		return student.getName();
	}

}
