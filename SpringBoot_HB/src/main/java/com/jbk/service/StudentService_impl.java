
package com.jbk.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.StudentDao;
import com.jbk.entity.Student;
@Service
public class StudentService_impl implements StudentService {
	
	@Autowired
	private StudentDao dao ;

	@Override
	public Student saveStudent(Student student) {
		String studentId = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		student.setStudentId(studentId);
         Student std= dao.saveStudent(student);

		return std;
	}

	@Override
	public Student getStudentById(String studentId) {
		Student student= dao.getStudentById(studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
	
		return null;
	}

	@Override
	public boolean deletStudentById(String studentid) {
		
		return false;
	}

	@Override
	public Student updateStudent(Student student) {
				return null;
	}

}
