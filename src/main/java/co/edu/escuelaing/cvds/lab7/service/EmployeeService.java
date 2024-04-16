package co.edu.escuelaing.cvds.lab7.service;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployee(Long employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }

    public void updateEmployee(Employee updatedEmployee) {
        employeeRepository.updateEmployee(updatedEmployee);
    }

    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.getEmployeeById(employeeId);
        if (employee != null) {
            employeeRepository.deleteEmployee(employee);
        }
    }

    public void deleteUser(Long employeeId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
}