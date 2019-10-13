public class Employee {
    private Long IdEmployee;
    private String FirstName;
    private String LastName;
    private String Address;
    private Double Salary;
    private Short Age;
    private String Position;

    public Employee(Long idEmployee,
                   String firstName,
                   String lastName,
                   String address,
                   Double salary,
                   Short age,
                   String position){
        this.IdEmployee = idEmployee;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Address = address;
        this.Salary = salary;
        this.Age = age;
        this.Position = position;
    }

    public Long getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.IdEmployee = idEmployee;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        this.Salary = salary;
    }

    public Short getAge() {
        return Age;
    }

    public void setAge(Short age) {
        this.Age = age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }


    public String toString()
    {
        return "IdEmployee: " + IdEmployee + "\nFirstName: " + FirstName + "\nLastName: " + LastName +
                "\nAddress: " + Address + "\nSalary: " + Salary + "\nAge: " + Age + "\nPosition: " + Position;
    }
}
