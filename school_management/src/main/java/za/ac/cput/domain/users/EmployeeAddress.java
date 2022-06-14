/*  Davin Carstens 220021333
 */
package za.ac.cput.domain.users;



import java.util.Objects;

public class EmployeeAddress
{
    private String staffId;
    private String address;

    public EmployeeAddress(String staffId, String address) {
        this.staffId = staffId;
        this.address = address;
    }

    private EmployeeAddress(Builder builder){
        this.staffId = builder.staffId;
        this.address = builder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Builder{
        private String staffId;
        private String address;

        public Builder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Builder copy(EmployeeAddress employeeAddress){
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(staffId, builder.staffId) && Objects.equals(address, builder.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(staffId, address);
        }
    }
}
