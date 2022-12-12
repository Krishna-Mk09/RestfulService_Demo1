package com.niit.jdp.RestfulService_Demo1.Repository;

import com.niit.jdp.RestfulService_Demo1.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Creating a repository for Student class.
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByUserNameAndPassword(String userName, String password);

}
