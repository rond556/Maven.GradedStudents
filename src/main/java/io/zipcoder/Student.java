package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> testScore){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public Integer getNumberOfExamScores(){
        return examScores.size();
    }

    public String printExamScores(ArrayList<Double> examScores){
        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores");
        for(int i = 0; i <= examScores.size() - 1; i++){
            sb.append(String.format("  Exam %d", i + 1));
            sb.append(String.format(" => %f2", examScores.get(i)));
        }
        return sb.toString();
    }

    public void addExamScore(double examScore, ArrayList<Double> examScores){
        examScores.add(examScore);
    }

    public void setExamScore(Integer examNumber, double newExamScore, ArrayList<Double> examScores){
        examScores.set(examNumber, newExamScore);
    }

    public double getAverageExamScores(){
        double sum = 0D;
        for(int i = 0; i <= examScores.size() - 1; i++){
            sum += examScores.get(i);
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }


    @Override
    public int compareTo(Student student2) {
        return Double.compare(this.getAverageExamScores(), student2.getAverageExamScores());
    }
}
