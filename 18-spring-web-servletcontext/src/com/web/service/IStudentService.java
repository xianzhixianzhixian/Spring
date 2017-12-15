/**
 * 作者：樊钰丰
 * 时间：2017.9.10
 * 功能：IStudentService接口
 */

package com.web.service;

import java.util.List;

import com.web.beans.Student;

public interface IStudentService {

	void addStudent(Student student);
	void removeById(int id);
	void modifyStudent(Student student);
	
	List<Student> findAllStudents();
	Student findStudentById(int id);
}
