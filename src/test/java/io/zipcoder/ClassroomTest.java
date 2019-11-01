package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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
    public void getStudentsByScore
    }
