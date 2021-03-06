/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：IStudentDao接口用于直接操作数据库
 */

package com.springmybatis.dao;

import java.util.List;

import com.springmybatis.beans.Student;

public interface IStudentDao {

	void insertStudent(Student student);
	void deleteById(int id);
	void updateStudent(Student student);
	
	List<String> selectAllStudentNames();
	String selectStudentNameById(int id);
	
	List<Student> selectAllStudents();
	Student selectStudentById(int id);
}
