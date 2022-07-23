package io.zipcoder;

import java.util.ArrayList;

public class Student {

    public String firstName = "";

    public String lastName = "";

    public ArrayList<Double> examScores;

    public String numberOfExamTaken;

    public void Student(String firstName, String lastName, Double[] testScores){

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

    public String getNUmberOfExamsTaken(){
        return getNUmberOfExamsTaken();
    }

    public String getExamScores(){
        String examString = "";

        for(int i = 0; i <= examScores.size(); i++){
            examString += "Exam " + i + 1 + " -> " + examScores.get(i) + "\n";
        }
        return examString;
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber - 1, newScore);
    }

    public Double getAverageExamScore(){
        int total = 0;
        double average = 0;
        for (int i = 0; i < examScores.size(); i++){
            total += examScores.get(i);
            average += (double) total/examScores.size();
        }
        return average;
    }

    public String toString(){
        return this.toString();
    }
}
