package za.ac.cput.domain.users;

import za.ac.cput.domain.details.Address;

import java.util.Objects;

public class StudentAddress
{
    private String studentId;
    private Address address;

    private StudentAddress(Builder builder)
    {
        this.studentId = builder.studentId;
        this.address = builder.address;
    }

    public String getStudentId() {
        return studentId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "studentId='" + studentId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder
    {
        private String studentId;
        private Address address;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(StudentAddress studentAddress)
        {
            this.studentId = studentAddress.studentId;
            this.address = studentAddress.address;
            return this;
        }

        public StudentAddress build(){return new StudentAddress(this);}
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        StudentAddress studentAddress = (StudentAddress) obj;
        return studentId.equals(studentAddress.studentId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(studentId);
    }
}
