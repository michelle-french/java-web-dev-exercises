package org.launchcode.java.demos.lsn4classes2;

import java.sql.SQLOutput;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private int courseCredits;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int credits) {
//        // Determine the grade level of the student based on numberOfCredits
        if(credits <= 29) {
            return "freshman";
        }else if(credits <= 59) {
            return "sophomore";
        }else if (credits <= 89){
            return "junior";
        }else{
            return "senior";
        }
    }

    // TODO: Complete the addGrade method.

        public void addGrade(int courseCredits, double grade) {
            double currentQS = this.gpa * this.numberOfCredits;
            currentQS += courseCredits * grade;
            this.numberOfCredits += courseCredits;
            this.gpa = currentQS/this.numberOfCredits;
        }
        // Update the appropriate fields: numberOfCredits, gpa
//    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student michelle = new Student("Michelle", 123, 1, 4.0);
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(michelle);
    }

    public String toString() {
        String studentReport = String.format(this.name+ " is a " +this.getGradeLevel(this.numberOfCredits) +" with "+this.getNumberOfCredits()+" credit and a GPA of " +this.getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || this.getClass() != toBeCompared.getClass()) {
            return false;
        }
        Student student = (Student) toBeCompared;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
}
