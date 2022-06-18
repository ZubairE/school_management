package za.ac.cput.schoolmanagement.domain.entity;
/* Student.java
   Student class for student management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 14 June 2022
 */

import java.util.Objects;

public class Student {
    private final String studentId, email, name;

    // Private constructor is required
    private Student(Builder builder){
        this.studentId = builder.studentId;
        this.email = builder.email;
        this.name = builder.name;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public static class Builder{
        private String studentId, email, name;

        public Student.Builder studentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Student.Builder email(String email){
            this.email = email;
            return this;
        }
        public Student.Builder name(String name){
            this.name = name;
            return this;
        }
        public Student.Builder copy(Student student){
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;
            return this;
        }
        public Student build(){return new Student(this);}


    }
    public static class StudentMainId{
        private String studentId, email;

        public StudentMainId(String studentId, String email){
            this.studentId = studentId;
            this.email = email;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getEmail() {
            return email;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (Builder) o;
        return studentId.equals(builder.studentId) && email.equals(builder.email) && name.equals(builder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, email, name);
    }

    @Override
    public String toString() {
        return "Builder{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
