package io.zipcoder;

import java.util.ArrayList;
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

    public void addStudents(Student student){
        for(int i = 0; i < students.length; i++){
            if(this.students[i] == null){
                this.students[i] = student;
                break;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        Student removedStudent = new Student(firstName, lastName, null);
        for(int i = 0; i < students.length; i++){
            if(students[i].getFirstName().equals(removedStudent.getFirstName())
            && students[i].getLastName().equals(removedStudent.getLastName())){
                students[i] = null;
            }
        }
    }

    public void getStudentsByScore(Student[] students) {
        Arrays.sort(students, Collections.reverseOrder());
    }


}