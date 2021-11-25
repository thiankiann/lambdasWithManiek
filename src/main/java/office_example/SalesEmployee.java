package office_example;

import java.util.UUID;

public class SalesEmployee extends Employee{

    private long salesAmountPerMounth;

    public SalesEmployee(String name, String surname, int age, String insuranceNumber, UUID employeeId, long salary) {
        super(name, surname, age, insuranceNumber, employeeId, salary);
    }

    @Override
    public long getBonus() {
        return (long) (1.5 * salesAmountPerMounth);
    }

    public long getSalesAmountPerMounth() {
        return salesAmountPerMounth;
    }

    public void setSalesAmountPerMounth(long salesAmountPerMounth) {
        this.salesAmountPerMounth = salesAmountPerMounth;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "salesAmountPerMounth=" + salesAmountPerMounth +
                "} " + super.toString();
    }
}
