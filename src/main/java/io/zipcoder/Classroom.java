package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(int maxNumberOfStudents, Student[] students){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudents(Student student, List<Student> students){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName, List<Student> students){
        Student removedStudent = new Student(firstName, lastName, null);
        students.remove(removedStudent);
    }

    //public Student[] getStudentsByScore(Student[] students){
      //  return Arrays.sort(students, Collections.reverseOrder(students));
    //}


}