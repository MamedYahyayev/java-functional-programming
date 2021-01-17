package az.maqa.fp;

import java.util.function.Function;

public class EmployeeMapper implements Function<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO apply(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employee.getName());
        employeeDTO.setSurname(employee.getSurname());
        employeeDTO.setAge(employee.getAge());
        return employeeDTO;
    }
}
