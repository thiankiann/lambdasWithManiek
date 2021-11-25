package office_example;

import java.util.UUID;

public abstract class Employee extends Person{

    private UUID employeeId;
    private long salary;

    public Employee(String name, String surname, int age, String insuranceNumber, UUID employeeId, long salary) {
        super(name, surname, age, insuranceNumber);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }
    public abstract long getBonus();

    public long calculateSalary(){
        return salary + getBonus();
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
