package dao;

import java.util.List;

import model.Student;

public interface StudentDAO {

	int saveStudent(Student student);

	int deleteStudent(int id);

	int updateStudent(Student student);

	List<Student> getAllStudents();

	Student findStudentById(int id);

}