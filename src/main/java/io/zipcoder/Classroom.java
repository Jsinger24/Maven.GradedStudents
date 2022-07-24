package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {

    public Student[] students;

    int maxNumberOfStudents;
    List<Student> studentList = new ArrayList<>();

    public Classroom(Student[] students ) {
        this.students = students;
    }
    public Classroom(int maxNUmberOfStudent){
        this.maxNumberOfStudents = maxNUmberOfStudent;
    }
    public Classroom(){
        students = new Student[30];
    }

    public Student[] getStudents(){
        students = studentList.toArray(students);
        return this.students;

    }
    public Double getAverageExamScore(){
        int total = 0;
        double average = 0;
        for (int i = 0; i < students.length; i++){
            total += students[i].getAverageExamScore();
            average += (double) total/students.length;
        }
        return average;
    }

    public void addStudent(Student student){

        studentList.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        List<Student> tempList = new ArrayList<>();
        int arrLength = students.length;
        for (int i = 0; i < students.length; i++){
            if(!Objects.equals(students[i].getFirstName(), firstName) && !Objects.equals(students[i].getLastName(), lastName)){
                tempList.add(students[i]);
            }
        }
        students = new Student[arrLength];
        students = tempList.toArray(students);
    }

    public Student[] getStudentByScore(){
        Boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < students.length; i++){
            if(students[i].getAverageExamScore() < students[i + 1].getAverageExamScore()){
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
                swapped = null;
            }
        }
            return null;

    }

}
