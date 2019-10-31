package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void constructorTest() {
        String expectedFirstName = "Edgar";
        String expectedLastName = "Figaro";
        ArrayList<Double> expectedScores = new ArrayList<>(Arrays.asList(100. , 100.0, 98.0, 96.0));
        Student student = new Student(expectedFirstName, expectedLastName, expectedScores);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        ArrayList<Double> actualScores = student.getExamScores();

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedScores, actualScores);

    }


    @Test
    public void getFirstName() {
        String expected = "Edgar";
        Student student = new Student("Edgar", null,null);

        String actual = student.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstName() {

        Student student = new Student(null, null,null);
        String expected = "Edgar";

        student.setFirstName(expected);
        String actual = student.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getLastName() {
        String expected = "Figaro";
        Student student = new Student(null, expected,null);

        String actual = student.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setLastName() {
        Student student = new Student(null, null,null);
        String expected = "Figaro";

        student.setLastName(expected);
        String actual = student.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getExamScores() {
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(100. , 100.0, 98.0, 96.0));
        Student student = new Student(null,null, expected);
        ArrayList<Double> actual = student.getExamScores();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setExamScores() {
        Student student = new Student(null, null,null);
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(100.0 , 100.0, 98.0, 96.0));

        student.setExamScores(expected);
        ArrayList<Double> actual = student.getExamScores();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfExamScores() {
        ArrayList<Double> expectedTests = new ArrayList<>(Arrays.asList(100.0 , 100.0, 98.0, 96.0));
        Student student = new Student(null, null,expectedTests);

        Integer expected = expectedTests.size();
        Integer actual = student.getNumberOfExamScores();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addExamScoresTest(){
        ArrayList<Double> actualTest = new ArrayList<>(Arrays.asList(100.0 , 100.0, 98.0, 96.0));
        Student student = new Student(null,null,actualTest);

        ArrayList<Double> expectedTest = new ArrayList<>(Arrays.asList(100.0 , 100.0, 98.0, 96.0,90.0));
        student.addExamScore(90.0, actualTest);

        Assert.assertEquals(expectedTest, actualTest);
    }

    @Test
    public void setExamScoreTest(){
        ArrayList<Double> actualTest = new ArrayList<>(Arrays.asList(94.0 , 100.0, 98.0, 96.0));
        Student student = new Student(null,null,null);
        Integer testNumber = 0;
        Double examScore = 100.0;

        ArrayList<Double> expectedTest = new ArrayList<>(Arrays.asList(100.0 , 100.0, 98.0, 96.0));
        student.setExamScore(testNumber,examScore,actualTest);

        Assert.assertEquals(expectedTest,actualTest);
    }

    @Test
    public void printExamScores(){
        ArrayList<Double> actualTest = new ArrayList<>(Arrays.asList(94.0 , 100.0, 98.0, 96.0));
        Student student = new Student(null,null,actualTest);
        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores\n  Exam 1 => 94.0");

        String expected = sb.toString();
        String actual = student.printExamScores(actualTest);
    }

    @Test
    public void getAverageExamScoresTest(){
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(94.0 , 100.0, 98.0, 96.0));
        Student student = new Student(null,null,examScores);
        Double sum = 0.0;
        Integer count = 0;
        for(Double score:examScores){
            sum+= examScores.get(count);
            count++;
        }

        Double expected = sum/examScores.size();
        Double actual = student.getAverageExamScores(examScores);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void compareTo(){
        ArrayList<Double> examScores1 = new ArrayList<>(Arrays.asList(94.0 , 100.0, 98.0, 100.0));
        ArrayList<Double> examScores2 = new ArrayList<>(Arrays.asList(97.0 , 98.0, 91.0, 92.0));
        Student student1 = new Student(null,null, examScores1);
        Student student2 = new Student(null,null, examScores2);
        Integer expected = Double.compare(student1.getAverageExamScores(examScores1), student2.getAverageExamScores(examScores2));
        Integer actual = student1.compareTo(student2, examScores2);
        Assert.assertEquals(expected,actual);

    }
}