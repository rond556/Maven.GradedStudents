package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

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
        ArrayList<Double> gogoTest = new ArrayList<>(Arrays.asList(94.0));
        ArrayList<Double> umaroTest = new ArrayList<>(Arrays.asList(67.0));
        ArrayList<Double> mogTest = new ArrayList<>(Arrays.asList(80.0));

        Student gogo = new Student("gogo", null,gogoTest);
        Student umaro = new Student("umaro", null, umaroTest);
        Student mog = new Student("mog", null, mogTest);

        Student[] expectedStudents = {gogo,mog,umaro};
        Classroom expectedClassroom = new Classroom(3,expectedStudents);

        Student[] actualStudents = {umaro, gogo, mog};
        Classroom actualClassroom = new Classroom(3,actualStudents);
        actualClassroom.getStudentsByScore();

        Assert.assertEquals(expectedClassroom.getStudents(),actualClassroom.getStudents());
    }

   @Test
    public void getGradeBookTest(){
       ArrayList<Double> gogoTest = new ArrayList<>(Arrays.asList(94.0, 98.0, 84.0));
       ArrayList<Double> umaroTest = new ArrayList<>(Arrays.asList(67.0, 78.0, 93.0));
       ArrayList<Double> mogTest = new ArrayList<>(Arrays.asList(80.0, 45.0, 56.0));
       ArrayList<Double> terraTest = new ArrayList<>(Arrays.asList(12.0, 5.0, 7.0));
       ArrayList<Double> lockeTest = new ArrayList<>(Arrays.asList(44.0, 35.0, 27.0));

       Student gogo = new Student("gogo", null,gogoTest);
       Student umaro = new Student("umaro", null, umaroTest);
       Student mog = new Student("mog", null, mogTest);
       Student terra = new Student("terra", null,terraTest);
       Student locke = new Student("locke", null, lockeTest);

       Student[] student = {gogo, umaro, mog, terra, locke};
       Classroom classroom = new Classroom(5,student);
       Map map = classroom.getGradeBook();
       Set<Map.Entry<String,Student>> entries = map.entrySet();
       StringBuilder sb = new StringBuilder();

       for(Map.Entry<String,Student> result : entries) {
           sb.append(result).append("\n");
       }

       String actual = sb.toString();
       String expected = "A=Student{firstName='gogo', lastName='null', examScores=[94.0, 98.0, 84.0]}\n" +
               "B=Student{firstName='umaro', lastName='null', examScores=[67.0, 78.0, 93.0]}\n" +
               "C=Student{firstName='mog', lastName='null', examScores=[80.0, 45.0, 56.0]}\n" +
               "D=Student{firstName='locke', lastName='null', examScores=[44.0, 35.0, 27.0]}\n" +
               "F=Student{firstName='terra', lastName='null', examScores=[12.0, 5.0, 7.0]}\n";

       Assert.assertEquals(expected,actual);
   }
    }
