/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package com.niit.jdp.RestfulService_Demo1.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @GeneratedValue
    @Id
    private int studentId;
    private String studentName;
    private int studentMarks;
    private String studentSection;
    private String userName;
    private String password;

    public Student() {
    }

    public Student(int studentId, String studentName, int studentMarks, String studentSection, String userName, String password) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        this.studentSection = studentSection;
        this.userName = userName;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentSection='" + studentSection + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
