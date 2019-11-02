package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }


    public Classroom(int maxNumberOfStudents, Student[] students){
        this.students = students;
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

    public void getStudentsByScore() {
        Arrays.sort(students, Collections.reverseOrder());
    }

    public Map getGradeBook(){
        TreeMap<String, Student> map = new TreeMap<>();
        for(int i = 0; i < students.length;i++){
            if(students[i].getAverageExamScores()/100 > .9){
                map.put("A",students[i]);
            } else if (students[i].getAverageExamScores()/100 <= .9 && students[i].getAverageExamScores()/100 > .7){
                map.put("B",students[i]);
            } else if (students[i].getAverageExamScores()/100 <= .7 && students[i].getAverageExamScores()/100 > .5){
                map.put("C",students[i]);
            } else if (students[i].getAverageExamScores()/100 <= .5 && students[i].getAverageExamScores()/100 > .1){
                map.put("D",students[i]);
            } else if (students[i].getAverageExamScores()/100 <= .1){
                map.put("F",students[i]);
            }
        }

        return map;
    }

}