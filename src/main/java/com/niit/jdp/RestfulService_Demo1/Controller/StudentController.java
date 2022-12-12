/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.RestfulService_Demo1.Controller;

import com.niit.jdp.RestfulService_Demo1.Domain.Student;
import com.niit.jdp.RestfulService_Demo1.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * It's a controller class that has a constructor injection of the IStudentService interface
 */
@CrossOrigin
@RestController
@RequestMapping("/api/vi")
public class StudentController {

    // A constructor injection.
    private final IStudentService studentService;

    // This is a constructor injection.
    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * This function is a POST request that takes in a JSON object and returns a JSON object
     *
     * @param student The object that will be saved in the database.
     * @return A response entity with the student object and a status of created.
     */
    @PostMapping("/insert")
    public ResponseEntity<?> saveFunction(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    /**
     * It returns a list of all students in the database
     *
     * @return A list of all students in the database.
     */
    @GetMapping("/fetchAll")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(studentService.fetchAllStudent(), HttpStatus.OK);
    }

    /**
     * This function deletes a student record from the database based on the studentId passed in the URL
     *
     * @param studentId The id of the student to be deleted.
     * @return A ResponseEntity object is being returned.
     */
    @DeleteMapping("/deleteStudentById/{studentId}")
    public ResponseEntity<?> deleteFunction(@PathVariable int studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Record Deleted", HttpStatus.CREATED);
    }

    /**
     * This function is a GET request that takes in a studentId as a path variable and returns a student object
     *
     * @param studentId This is the path variable that is used to fetch the student by id.
     * @return A ResponseEntity object is being returned.
     */
    @GetMapping("/getStudentById/{studentId}")
    public ResponseEntity<?> getByIdFunction(@PathVariable int studentId) {
        studentService.fetchStudentById(studentId);
        return new ResponseEntity<>(studentService.fetchStudentById(studentId), HttpStatus.CREATED);

    }

    @PutMapping("/updateStudentById/{studentId}")
    public ResponseEntity<?> updateByIdFunction(@RequestBody @PathVariable int studentId) {
        studentService.updateStudent(studentId);
        return new ResponseEntity<>("Student  Details Updated ", HttpStatus.OK);
    }

    @GetMapping("/getByUserNameAndPassword")
    public ResponseEntity<?> getByEmailAndPassword(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.getByUserNameAndPassword(student.getUserName(), student.getPassword()), HttpStatus.OK);
    }
}
