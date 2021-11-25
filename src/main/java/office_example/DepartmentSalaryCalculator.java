package office_example;

import java.util.List;
/**Exc.11
 Stworz klase:
        * ktora bedzie w stanie wyliczac pensje dla calego dzialu (wszystkich pracownikow)
        * Przy czym, chcemy to zrobic jak najbardziej uniwersalnie
        Zeby np. Unikac takich sytuacji - ze gdy nastapi jakas reorganizacja lub powstanie jakas nowa komórka - to  nasza klasna nie bedzie dzialala
*/
public class DepartmentSalaryCalculator {
    public long CalculateSalaryForDepartment(List<? extends Employee> employees){

        return employees.stream().
                mapToLong(employee -> employee.getSalary()).
                sum();
    }
}
