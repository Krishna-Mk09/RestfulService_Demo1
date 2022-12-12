/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.RestfulService_Demo1.Service;

import com.niit.jdp.RestfulService_Demo1.Domain.Student;
import com.niit.jdp.RestfulService_Demo1.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * It implements the StudentService interface and uses the StudentRepository to save and fetch data from the database
 */
@Service
public class StudentServiceImpl implements IStudentService {

    // A constructor injection.
    private final StudentRepository studentRepository;

    // A constructor injection.
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * It deletes a student from the database.
     *
     * @param studentId The id of the student to be deleted.
     * @return A boolean value.
     */
    @Override
    public boolean deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
        return true;
    }

    /**
     * It fetches all the students from the database.
     *
     * @return A list of all students in the database.
     */
    @Override
    public List<Student> fetchAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> fetchStudentById(int studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public boolean updateStudent(int studentId) {
        return studentRepository.existsById(studentId);
    }

    @Override
    public Student getByUserNameAndPassword(String userName, String password) {
        return studentRepository.findByUserNameAndPassword(userName, password);
    }

}
