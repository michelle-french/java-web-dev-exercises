package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student michelle = new Student("Michelle", 123, 1, 4.0);
        System.out.println(michelle.getStudentId());
    }
    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }
    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String aFirstName) {
            this.firstName = aFirstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String aLastName) {
            this.lastName = aLastName;
        }
        public String getSubject() {
            return subject;
        }
        public void setSubject(String aSubject) {
            this.subject = aSubject;
        }
        public int getYearsTeaching() {
            return yearsTeaching;
        }
        private void setYearsTeaching(int aYearsTeaching) {
            this.yearsTeaching = aYearsTeaching;
        }

    }
}
