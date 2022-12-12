package com.niit.jdp.RestfulService_Demo1.Service;

import com.niit.jdp.RestfulService_Demo1.Domain.Student;

import java.util.List;
import java.util.Optional;

// This is a service interface.
public interface IStudentService {
    Student saveStudent(Student student);

    boolean deleteStudent(int studentId);

    List<Student> fetchAllStudent();

    Optional<Student> fetchStudentById(int studentId);

    boolean updateStudent(int studentId);

    Student getByUserNameAndPassword(String userName, String password);

}
