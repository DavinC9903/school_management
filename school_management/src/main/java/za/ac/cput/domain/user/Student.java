package za.ac.cput.domain.user;

import za.ac.cput.domain.details.Name;

import java.util.Objects;

public class Student
{
    private String studentId, email;
    private Name name;

    private Student(Builder builder)
    {
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

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder
    {
        private String studentId, email;
        private Name name;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder copy(Student student)
        {
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;
            return this;
        }

        public Student build(){return new Student(this);}
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(studentId);
    }
}
