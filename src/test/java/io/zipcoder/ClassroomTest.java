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
    }

    @Test
    public void setStudentsTest() {
    }

    @Test
    public void addStudentsTest() {
    }

    @Test
    public void removeStudentTest() {
    }
}