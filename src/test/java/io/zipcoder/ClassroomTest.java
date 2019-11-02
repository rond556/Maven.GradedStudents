package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void constructor1Test(){
        Classroom expected = new Classroom(24);
        Assert.assertNotNull(expected);

    }

    @Test
    public void constructor2Test(){
        Integer expectedNumberofStudents = 24;
        Student[] expectedStudents = new Student[expectedNumberofStudents];
      Classroom classroom = new Classroom(expectedNumberofStudents,expectedStudents);
      Assert.assertEquals(24,classroom.getStudents().length);


    }

    @Test
    public void constructor3Test(){
       Classroom actual = new Classroom();
       Assert.assertEquals(30, actual.getStudents().length);

    }

    @Test
    public void getStudentsTest() {
        Student gogo = new Student(null,null,null);
        Student[] expected = {gogo};
        Classroom classroom = new Classroom(1, null);

        classroom.setStudents(expected);
        Student[] actual = classroom.getStudents();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setStudentsTest() {
        Student gogo = new Student(null,null,null);
        Student[] expected = {gogo};
        Classroom classroom = new Classroom(1, null);

        classroom.setStudents(expected);
        Student[] actual = classroom.getStudents();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentsTest() {
        Student gogo = new Student("Gogo","Gogo",null);
        Student[] actualArray = new Student[1];
        Classroom actualClassroom = new Classroom(1,actualArray);
        actualClassroom.addStudents(gogo);


        Assert.assertTrue(actualClassroom.getStudents()[0] != null);
    }

    @Test
    public void removeStudentTest() {
        Student gogo = new Student("Gogo","Gogo",null);
        Student[] actualArray = new Student[1];
        Classroom actualClassroom = new Classroom(1,actualArray);
        actualClassroom.addStudents(gogo);
        actualClassroom.removeStudent("Gogo", "Gogo");


        Assert.assertTrue(actualClassroom.getStudents()[0] == null);
    }

    @Test
    public void getStudentsByScore(){
        ArrayList<Double> gogoTest = new ArrayList<>(Arrays.asList(94.0 , 100.0, 98.0, 96.0));
        ArrayList umaroTest = new ArrayList(Arrays.asList(67.0 , 22.0, 130, 78.0));
        ArrayList mogTest = new ArrayList(Arrays.asList(8.0 , 86, 90.0, 93.0));
        Student gogo = new Student("gogo", null,gogoTest);
        Student umaro = new Student("umaro", null, umaroTest);
        Student mog = new Student("moogle", null, mogTest);
        Student[] expectedStudents = {gogo,mog,umaro};
        Classroom expectedClassroom = new Classroom(3,expectedStudents);
        Student[] students = {umaro, gogo, mog};
        Classroom actualClassroom = new Classroom(3,students);
        actualClassroom.getStudentsByScore(students);

        Assert.assertEquals(expectedClassroom,actualClassroom);


    }
    }
