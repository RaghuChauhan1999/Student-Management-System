package com.main.studentmanagementsystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.studentmanagementsystem.entity.Student;
import com.main.studentmanagementsystem.repository.StudentRepository;
import com.main.studentmanagementsystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService{

	@Autowired
	StudentRepository Studentrepository;
	
	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list = Studentrepository.findAll();
		
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return Studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return Studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		Studentrepository.deleteById(id);
	}

	@Override
	public Student updateStudent(int id, Student std) {
		Student st = Studentrepository.findById(id).get();
		
		
		st.setFirstName(std.getFirstName());
		st.setLastName(std.getLastName());
		st.setEmail(std.getEmail());
		
		return Studentrepository.save(st);
	}

	

	
	

}
